# qa9-it114-003
Milestone 1:
• Server can be started via command line and listen for connections
  ‣ Related output should be present about incoming port
• Client can be started via command line
  ‣ Related output should mention that the client is waiting for input
• Client can connect to the running Server
  ‣ A client name must be set first with /name
  ‣ Client connects via the /connect command
  ‣ Related output should show successful connection
• Server should be able to allow more than one Client to be connected at once
• Server will implement a concept of “Rooms” where the first room is labeled as “Lobby”
• Clients can create new Rooms once connected
  ‣ A “X left the room” message will be shown upon leaving the Room
  ‣ A “X joined the room” message will be shown upon joining the Room
• Client can send messages to the Server-side
  ‣ Messages will be relayed to all connected Clients in the same Room
  ‣ Messages will not be relayed across Rooms
  ‣ Each message will have an identifier of who the message was from (i.e., Client Name)
• Clients can disconnect and reconnect without crashing the Server
  ‣ The Server terminating should not cause the the Clients to terminate as well (just disconnect)
  ‣ Clients should receive a disconnected message
  ‣ Clients should be able to reconnect when the Server comes back online
