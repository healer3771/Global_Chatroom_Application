# Global Chatroom Application
Create a UI Panel for connecting to the server
Username (don’t allow spaces)
Host
Port
Create a UI Panel for the chatroom
List of users in the room
Text area for the chat history
Input field for typing messages
Button for sending messages
Pressing enter should also submit the button if the input field isn’t empty
Results from /flip and /roll appear in a different format than regular chat text (format is of your choosing)
Text Formatting from Milestone 2 should appear correctly in the chat area (the style must be visible)
Messages that precede with @username will send the message privately to the user denoted by the username
Note: This will not be a slash command
Note: The writer and the receiver are the only two that will receive the message from the server-side
It’s not valid to just hide it on the client-side (i.e., data must not be sent from the server-side)
The Client-side will capture the message/target, find the appropriate client id, and send that along with the original message to the server-side
If a client id isn’t found for the target, a message will be shown to the Client stating so and will not cause a payload to be sent to the server-side
The ServerThread will receive this payload and pass the id and message to the Room
The Room will match the id to the respective target and send the message to the sender and target (receiver)
Mute and Unmute
Client-side will implement a /mute and /unmute command (i.e., /mute Bob or /unmute Bob)
Client side grabs the target and finds the client id related to the target
If no target found, an appropriate message will be displayed and no message will be sent
If a target is found, the id will be sent in a payload to the server-side with the appropriate action
ServerThread will receive the payload and extract the data, then pass it to a Room method
The Room will confirm the id against the list of clients
If found, it’ll record the client’s name on a list of the sender’s ServerThread for a mute, otherwise it’ll remove the name from the list
Note: This list must be unique and must not be directly exposed, the ServerThread must provide method accessors like add()/remove()
Upon success mute/unmute, the sender should receive a confirmation of the action clearly stating what happened
Any time a message would be received (i.e., normal messages or private messages) the sender’s name will be compared against the receiver’s mute list
Note: The mute list won’t be exposed directly, there should be a method on the ServerThread that takes the name and returns a boolean about whether or not the person is muted
If the user is muted, the receive must not be sent the message (i.e., they get skipped)
You must log in the terminal that the message was skipped due to being muted, but no message should be sent in this regard 
