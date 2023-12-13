package Project.server;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Project.common.Constants;

public class Room implements AutoCloseable {
    // server is a singleton now so we don't need this
    // protected static Server server;// used to refer to accessible server
    // functions
    private String name;
    private List<ServerThread> clients = new ArrayList<ServerThread>();
    private boolean isRunning = false;
    // Commands
    private final static String COMMAND_TRIGGER = "/";
    private final static String CREATE_ROOM = "createroom";
    private final static String JOIN_ROOM = "joinroom";
    private final static String DISCONNECT = "disconnect";
    private final static String LOGOUT = "logout";
    private final static String LOGOFF = "logoff";
    private static Logger logger = Logger.getLogger(Room.class.getName());

    public Room(String name) {
        this.name = name;
        isRunning = true;
    }

    public String getName() {
        return name;
    }

    public boolean isRunning() {
        return isRunning;
    }

    protected synchronized void addClient(ServerThread client) {
        if (!isRunning) {
            return;
        }
        client.setCurrentRoom(this);
        if (clients.indexOf(client) > -1) {
            logger.warning("Attempting to add client that already exists in room");
        } else {
            clients.add(client);
            client.sendResetUserList();
            syncCurrentUsers(client);
            sendConnectionStatus(client, true);
            //set to sent the block list to send payload
            initBlockListForUI(client);
            reinitBlockListForUI(client);
            

        }
    }
    protected void initBlockListForUI(ServerThread client){
        ArrayList<String> blockedlist = client.getBlockedList();
        for (String name: blockedlist){
            long myblockedid= getClientIdFromName(name);
            client.sendBlocked(myblockedid);
        }
    }
    
     protected void reinitBlockListForUI(ServerThread client) {
        Iterator<ServerThread> iter = clients.iterator();
        while (iter.hasNext()) {
            ServerThread existingClient = iter.next();
            if (existingClient.getBlockedList().contains(client.getClientName())) {
                existingClient.sendBlocked(client.getClientId());
                }
        }
    }

    protected synchronized void removeClient(ServerThread client) {
        if (!isRunning) {
            return;
        }
        // attempt to remove client from room
        try {
            clients.remove(client);
        } catch (Exception e) {
            logger.severe(String.format("Error removing client from room %s", e.getMessage()));
            e.printStackTrace();
        }
        // if there are still clients tell them this person left
        if (clients.size() > 0) {
            sendConnectionStatus(client, false);
        }
        checkClients();
    }

    private void syncCurrentUsers(ServerThread client) {
        Iterator<ServerThread> iter = clients.iterator();
        while (iter.hasNext()) {
            ServerThread existingClient = iter.next();
            if (existingClient.getClientId() == client.getClientId()) {
                continue;// don't sync ourselves
            }
            boolean messageSent = client.sendExistingClient(existingClient.getClientId(),
                    existingClient.getClientName());
            if (!messageSent) {
                handleDisconnect(iter, existingClient);
                break;// since it's only 1 client receiving all the data, break if any 1 send fails
            }
        }
    }

    /***
     * Checks the number of clients.
     * If zero, begins the cleanup process to dispose of the room
     */
    private void checkClients() {
        // Cleanup if room is empty and not lobby
        if (!name.equalsIgnoreCase(Constants.LOBBY) && (clients == null || clients.size() == 0)) {
            close();
        }
    }

    /***
     * Helper function to process messages to trigger different functionality.
     * 
     * @param message The original message being sent
     * @param client  The sender of the message (since they'll be the ones
     *                triggering the actions)
     */
    @Deprecated // not used in my project as of this lesson, keeping it here in case things
                // change
    private boolean processCommands(String message, ServerThread client) {
        boolean wasCommand = false;
        try {
            if (message.startsWith(COMMAND_TRIGGER)) {
                String[] comm = message.split(COMMAND_TRIGGER);
                String part1 = comm[1];
                String[] comm2 = part1.split(" ");
                String command = comm2[0];
                String roomName;
                wasCommand = true;
                switch (command) {
                    case CREATE_ROOM:
                        roomName = comm2[1];
                        Room.createRoom(roomName, client);
                        break;
                    case JOIN_ROOM:
                        roomName = comm2[1];
                        Room.joinRoom(roomName, client);
                        break;
                    case DISCONNECT:
                    case LOGOUT:
                    case LOGOFF:
                        Room.disconnectClient(client, this);
                        break;
                    default:
                        wasCommand = false;
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wasCommand;
    }

    // Command helper methods
    protected static void getRooms(String query, ServerThread client) {
        String[] rooms = Server.INSTANCE.getRooms(query).toArray(new String[0]);
        client.sendRoomsList(rooms,
                (rooms != null && rooms.length == 0) ? "No rooms found containing your query string" : null);
    }

    protected static void createRoom(String roomName, ServerThread client) {
        if (Server.INSTANCE.createNewRoom(roomName)) {
            Room.joinRoom(roomName, client);
        } else {
            client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s already exists", roomName));
        }
    }

    /**
     * Will cause the client to leave the current room and be moved to the new room
     * if applicable
     * 
     * @param roomName
     * @param client
     */
    protected static void joinRoom(String roomName, ServerThread client) {
        if (!Server.INSTANCE.joinRoom(roomName, client)) {
            client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s doesn't exist", roomName));
        }
    }

    protected static void disconnectClient(ServerThread client, Room room) {
        client.disconnect();
        room.removeClient(client);
    }
    // end command helper methods

    /***
     * Takes a sender and a message and broadcasts the message to all clients in
     * this room. Client is mostly passed for command purposes but we can also use
     * it to extract other client info.
     * 
     * @param sender  The client sending the message
     * @param message The message to broadcast inside the room
     */
    protected synchronized void sendMessage(ServerThread sender, String message) {
        if (!isRunning) {
            return;
        }
        logger.info(String.format("Sending message to %s clients", clients.size()));
        if (sender != null && processCommands(message, sender)) {
            // it was a command, don't broadcast
            return;
        }
        //converter mark down to HTML message is being called before sending the message
        //message = convertMarkdownToHTML(message);
		//Qadeer Ahmad
		//Ucid: qa9
		//Date: 11/26/2023
        //check if the message starts with "/roll" "/flip and runs the flip or roll method to give the final answers"
        if(message.startsWith("/")){
            String text = message.split(" ")[0];
            if (text.equals("/roll") && (message.split(" ").length == 2)){
                String numbers = message.split(" ")[1];
                if(numbers.matches("\\d+d{1}\\d+")){
                    int ndice = Integer.parseInt(numbers.split("d")[0]);
                    int sides = Integer.parseInt(numbers.split("d")[1]);
                    message = roll(ndice,sides);
                }
                else if(numbers.matches("\\d+")){
                    int sides = Integer.parseInt(numbers);
                    message = roll(1,sides);
                }
            }
            else if(text.equals("/flip")){
                    message = flip();
            }
        //Qadeer Ahmad
	    //Ucid: qa9
	    //Date: 12/13/2023
        //Checking the coming message to see if starts with /mute and then check the blocklist with the given user and block that user
            else if(text.equals("/mute") && (message.split(" ").length==2)){
                String blockeduser = message.split(" ")[1];
                if (!sender.getBlockedList().contains(blockeduser)){
                    sender.block(blockeduser);
                    message= "_muted "+ blockeduser +"_";
                    //using the getClientIdFromName method to get client name.
                    sender.sendBlocked(getClientIdFromName(blockeduser));
                }
                else{
                    message="_already muted "+ blockeduser +"_";
                }
        }
            //Checking the coming message to see if starts with /unmute and then check the blocklist with the given user and unblock that user
            else if(text.equals("/unmute") && (message.split(" ").length==2)){
                String unblockeduser = message.split(" ")[1];
                if(sender.getBlockedList().contains(unblockeduser)){
                    sender.unblock(unblockeduser);
                    message= "_unmuted "+ unblockeduser +"_";

                    // paload block via serverthread
                    sender.sendUnblocked(getClientIdFromName(unblockeduser));
                }
                else{
                    message="_"+ unblockeduser +" is already unmuted_";
                }

        }
		}
        //Qadeer Ahmad
	    //Ucid: qa9
	    //Date: 11/26/2023
        if(message.toUpperCase().startsWith("@")){
            String mymessage= message.substring(1);
            String clientname= mymessage.split(" ")[0];
            String finalmessage= mymessage.replaceFirst(mymessage.split(" ")[0], "");
            sendPrivateMessage(sender, clientname, finalmessage);
            return;
        }
        else{
            sendPublicMessage(sender, message);
        }
        
    }

    //Qadeer Ahmad
	//Ucid: qa9
	//Date: 12/13/2023
    //function for to get Client ID
    protected long getClientIdFromName(String name){
        long id;
        Iterator<ServerThread> iter = clients.iterator();
        while (iter.hasNext()) {
            ServerThread client = iter.next();
            // name = client from list
            if (client.getClientName().equals(name)){
                id = client.getClientId();
                return id;
            }
        }
        //fix if client not found
        return -1;
    }

    //Qadeer Ahmad
	//Ucid: qa9
	//Date: 11/26/2023
    protected void sendPrivateMessage(ServerThread sender, String recipName, String message){
        message = convertMarkdownToHTML(message);
        long from = sender == null ? Constants.DEFAULT_CLIENT_ID : sender.getClientId();
        Iterator<ServerThread> it = clients.iterator();
        // if sender does not exist in recipName.blockedlist then // if !blockedlist.contains(long from)
        
        while (it.hasNext()) {
            ServerThread client = it.next();
            if (!client.getBlockedList().contains(sender.getClientName())){
                if(client.getClientName() == sender.getClientName() || client.getClientName().equals(recipName)){ 
                    //send message to client personally and show sender
                    String sentmessage= message+" [SENT PRIVATELY TO "+recipName.toUpperCase()+" ]";
                    client.sendMessage(from, sentmessage);
                }
            }
        }
    }
    protected void sendPublicMessage(ServerThread sender, String message){
        message = convertMarkdownToHTML(message);
        long from = sender == null ? Constants.DEFAULT_CLIENT_ID : sender.getClientId();
        Iterator<ServerThread> iter = clients.iterator();
        while (iter.hasNext()) {
            ServerThread client = iter.next();
            // if sender does not exist in recipName.blockedlist then
            if (!client.getBlockedList().contains(sender.getClientName())){
                boolean messageSent = client.sendMessage(from, message);
                //chatlog if(client.getClientName() == sender.getClientName() ){ .../ client.chatLog(message)}
                if (!messageSent) {
                    handleDisconnect(iter, client);
                }
            }
        }
    }

    

	//Qadeer Ahmad
	//Ucid: qa9
	//Date: 11/26/2023
	//Implementing the coin toss feature which flip the coin and come on 0 which is heads or 1 which is tails
    private String flip(){
        // Generate random 0 or 1 for heads/tails
        int result = (int)(Math.random() * 2);
        // Map result to heads/tails
        //using the html tag with style color and bold format to change the given output according to the client answer
        String coinSide = result == 0 ? "<span style=\"color:#8B008B\"><b>Flip the coin and got tails in room " + getName() + "</b></span>" : 
        "<span style=\"color:#8B008B\"><b>Flip the coin and got heads in room " + getName() + "</b></span>"; 
        return coinSide;  
    }



    
    //Qadeer Ahmad
	//Ucid: qa9
	//Date: 11/26/2023
	//Implementing the roll dice feature which dice the roll according to the given values
    private String roll(int num,int sides){
        String finalresult="";
        int total = 0;
        for(int i=0; i< num; i++){
            total += (int)(Math.random() * sides) + 1; 
            //using the html tag with style color and bold format to change the given output according to the client answer
            finalresult = "<span style=\"color:#8B008B\"><b>Rolled the dice and got "+total+ " in room " + getName() + "</b></span>";
         }
        return finalresult;
    }

        //Qadeer Ahmad
	    //Ucid: qa9
	    //Date: 11/13/2023
        //the code transforms specific markdown-style formatting in the input message into equivalent HTML tags, providing a way to convert simple markdown to HTML.
    private String convertMarkdownToHTML(String inputMessage){
        String regexPattern = "(\\*([^*]){1,}\\*|\\_([^_]){1,}\\_|~([^~]){1,}~|\\&[r].{1,}\\&[r]|\\&[g].{1,}\\&[g]|\\&[b].{1,}\\&[b])";
    
        Pattern customPattern = Pattern.compile(regexPattern);
        Matcher customMatcher = customPattern.matcher(inputMessage);
        String processedMessage = inputMessage;
        String repTag = "";
    
        while(customMatcher.find()){
            String trimmedContent = customMatcher.group().substring(1, customMatcher.group().length()-1);
            if (customMatcher.group().startsWith("*")){
                repTag = "<b>" + trimmedContent + "</b>";
            }
            else if(customMatcher.group().startsWith("_")){
                repTag = "<i>" + trimmedContent + "</i>";
            }
            else if(customMatcher.group().startsWith("~")){
                repTag = "<u>" + trimmedContent + "</u>";
            }
            else if(customMatcher.group().startsWith("&")){
                trimmedContent = customMatcher.group().substring(2, customMatcher.group().length()-2);
                // Color
                if(customMatcher.group().startsWith("&r")){
                    repTag = "<span style=\"color:red\">" + trimmedContent + "</span>";
                }
                else if(customMatcher.group().startsWith("&g")){
                    repTag = "<span style=\"color:green\">" + trimmedContent + "</span>";
                }
                else if(customMatcher.group().startsWith("&b")){
                    repTag = "<span style=\"color:blue\">" + trimmedContent + "</span>";
                }
            }
            processedMessage = customMatcher.replaceFirst(repTag);
            customMatcher = customPattern.matcher(processedMessage);
            }
        return processedMessage;
    }
    


    protected synchronized void sendConnectionStatus(ServerThread sender, boolean isConnected) {
        Iterator<ServerThread> iter = clients.iterator();
        while (iter.hasNext()) {
            ServerThread receivingClient = iter.next();
            boolean messageSent = receivingClient.sendConnectionStatus(
                    sender.getClientId(),
                    sender.getClientName(),
                    isConnected);
            if (!messageSent) {
                handleDisconnect(iter, receivingClient);
            }
        }
    }

    private void handleDisconnect(Iterator<ServerThread> iter, ServerThread client) {
        iter.remove();
        logger.info(String.format("Removed client %s", client.getClientName()));
        sendMessage(null, client.getClientName() + " disconnected");
        checkClients();
    }

    public void close() {
        Server.INSTANCE.removeRoom(this);
        isRunning = false;
        clients.clear();
    }
}