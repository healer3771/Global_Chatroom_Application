package Part3HW;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Server {
    int port = 3001;
    // connected clients
    private List<ServerThread> clients = new ArrayList<ServerThread>();

    private void start(int port) {
        this.port = port;
        // server listening
        try (ServerSocket serverSocket = new ServerSocket(port);) {
            Socket incoming_client = null;
            System.out.println("Server is listening on port " + port);
            do {
                System.out.println("waiting for next client");
                if (incoming_client != null) {
                    System.out.println("Client connected");
                    ServerThread sClient = new ServerThread(incoming_client, this);
                    
                    clients.add(sClient);
                    sClient.start();
                    incoming_client = null;
                    
                }
            } while ((incoming_client = serverSocket.accept()) != null);
        } catch (IOException e) {
            System.err.println("Error accepting connection");
            e.printStackTrace();
        } finally {
            System.out.println("closing server socket");
        }
    }
    protected synchronized void disconnect(ServerThread client) {
		long id = client.getId();
        client.disconnect();
		broadcast("Disconnected", id);
	}
    
    protected synchronized void broadcast(String message, long id) {
        if(processCommand(message, id)){

            return;
        }
        // let's temporarily use the thread id as the client identifier to
        // show in all client's chat. This isn't good practice since it's subject to
        // change as clients connect/disconnect
        message = String.format("User[%d]: %s", id, message);
        // end temp identifier
        
        // loop over clients and send out the message
        Iterator<ServerThread> it = clients.iterator();
        while (it.hasNext()) {
            ServerThread client = it.next();
            boolean wasSuccessful = client.send(message);
            if (!wasSuccessful) {
                System.out.println(String.format("Removing disconnected client[%s] from list", client.getId()));
                it.remove();
                broadcast("Disconnected", id);
            }
        }
    }

    private boolean processCommand(String message, long clientId){
        System.out.println("Checking command: " + message);
        
        //Qadeer Ahmad
        //UCID: qa9
        //Date: 10/16/2023
        //Implementing the coin toss feature which flip the coin and come on 0 which is heads or 1 which is tails
        // Check if message is a coin flip command
        if(message.equalsIgnoreCase("flip") || message.equalsIgnoreCase("toss") || message.equalsIgnoreCase("coin")){
            // Generate random 0 or 1 for heads/tails
            int result = (int)(Math.random() * 2);
            // Map result to heads/tails
            String coinSide = result == 0 ? "heads" : "tails"; 
            // Format message with user ID, action, and result 
            message = String.format("User[%d] flipped a coin and got %s", clientId, coinSide);
            // Send message back to all clients
            broadcast(message, clientId);  
            
            return true;
        }


        //Qadeer Ahmad
        //UCID: qa9
        //Date: 10/16/2023
        //Implementing the roll dice feature which dice the roll according to the given values
        // Check if message is a dice roll command
        if(message.matches("roll \\d+d\\d+")){
        // Split message to get number of rolls and sides
        String[] parts = message.split(" ");
        int rolls = Integer.parseInt(parts[1].split("d")[0]);
        int sides = Integer.parseInt(parts[1].split("d")[1]);
        
        // Roll dice and sum rolls
        int total = 0;
        for(int i=0; i<rolls; i++){
            total += (int)(Math.random() * sides) + 1; 
    }
        // Format message with user ID, action, and result
        message = String.format("User[%d] rolled %sd%s and got %d", clientId, rolls, sides, total);
        
        // Send message back to all clients 
        broadcast(message, clientId);
        return true;
  }
          
        
        if(message.equalsIgnoreCase("disconnect")){
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if(client.getId() == clientId){
                    it.remove();
                    disconnect(client);
                    
                    break;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Starting Server");
        Server server = new Server();
        int port = 3000;
        try {
            port = Integer.parseInt(args[0]);
        } catch (Exception e) {
            // can ignore, will either be index out of bounds or type mismatch
            // will default to the defined value prior to the try/catch
        }
        server.start(port);
        System.out.println("Server Stopped");
    }
}