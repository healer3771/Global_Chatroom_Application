<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Qadeer Ahmad (qa9)</td></tr>
<tr><td> <em>Generated: </em> 12/13/2023 12:48:27 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-chatroom-milestone4/grade/qa9" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T01.04.22Screenshot%202023-12-12%20at%207.52.42%E2%80%AFPM.png.webp?alt=media&token=aed1642e-697e-42d3-bba1-3ec3ff037904"/></td></tr>
<tr><td> <em>Caption:</em> <p>Export button to export chat into HTML file<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T01.18.35Screenshot%202023-12-12%20at%208.10.02%E2%80%AFPM.png.webp?alt=media&token=1bae6efc-e9fc-4ec0-82bd-e32ce82e0a2f"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client &quot;Qadeer&quot; Sending messages in a different format and also sending private message<br> <br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T01.21.02Screenshot%202023-12-12%20at%208.11.30%E2%80%AFPM.png.webp?alt=media&token=b11a6616-f56d-4b0f-b23c-25f852c4fc8a"/></td></tr>
<tr><td> <em>Caption:</em> <p>Exported history of Client &quot;Qadeer&quot;<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T01.27.42Screenshot%202023-12-12%20at%208.25.27%E2%80%AFPM.png.webp?alt=media&token=d34c8e26-ea70-4000-833f-f2d374387e60"/></td></tr>
<tr><td> <em>Caption:</em> <p>Exported History of Client &quot;James&quot; that show the private Message from &quot;Qadeer&quot;<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T01.59.04Screenshot%202023-12-12%20at%208.30.17%E2%80%AFPM.png.webp?alt=media&token=69279e4e-6c29-4810-8c6a-230b03b4d25d"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code of the Export Button and the saved export HTML files<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>In the Java file <code>ChatPanel.java</code>, a <code>StringBuilder</code> named <code>myChatLog</code> is utilized to store<br>user messages, alternating between sent and received, with a <code>&amp;lt;br&amp;gt;</code> tag between each<br>appended message. Additionally, an export button is implemented and positioned at the top<br>of the chat panel. When this button is clicked, it triggers the creation<br>of a new HTML file. The filename is based on the date and<br>time of the export. The content of the <code>myChatLog</code> StringBuilder, including HTML opening<br>and closing tags, is then written to this newly created HTML file. The<br>resulting HTML files are stored in the directory <code>project/client/chatlog/</code>.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T13.43.54Screenshot%202023-12-13%20at%208.34.53%E2%80%AFAM.png.webp?alt=media&token=faf49414-2bee-4f40-8a86-68566a2c4d24"/></td></tr>
<tr><td> <em>Caption:</em> <p>Qadeer has muted the James and Ahmad.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T13.47.38Screenshot%202023-12-13%20at%208.35.04%E2%80%AFAM.png.webp?alt=media&token=abc95469-501d-4d15-a74c-dd18be26af30"/></td></tr>
<tr><td> <em>Caption:</em> <p>James has muted the Qadeer and Ahmad.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T13.47.53Screenshot%202023-12-13%20at%208.35.45%E2%80%AFAM.png.webp?alt=media&token=6320e0ee-ad6c-4f31-b809-c79cbef9826c"/></td></tr>
<tr><td> <em>Caption:</em> <p>txt files created with the list of names of user who are blocked<br>or muted.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T13.53.23Screenshot%202023-12-13%20at%208.39.29%E2%80%AFAM.png.webp?alt=media&token=d5eca481-e89e-4f69-8237-8be157e4a840"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code showing functions to initialize blockedlist() from file when client is connected, and<br>code to update the file when client adds or removes users off their<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T13.53.26Screenshot%202023-12-13%20at%208.40.55%E2%80%AFAM.png.webp?alt=media&token=1a0af037-a57e-4962-818e-e0ca148268bf"/></td></tr>
<tr><td> <em>Caption:</em> <p>Function which updates file called when block and unblock function is called<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>Upon client connection, the program checks if a file exists. If it does,<br>the content of the file is read into an ArrayList using the initBlockedList<br>function. The list contains blocked user names in the format [name, name, name],<br>which is split using regex into an array. Subsequently, each name is iteratively<br>added to the list.<br><br>When a client is muted or unmuted, the respective name<br>is added to or removed from the blocklist ArrayList. Following this, the updateBlockList<br>function is invoked, which essentially updates the file by overwriting it with the<br>modified blocklist (blocklist.toString()).<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T17.05.21Screenshot%202023-12-13%20at%2011.58.42%E2%80%AFAM.png.webp?alt=media&token=f4031804-12a9-4ee0-a655-c3dfa644ae36"/></td></tr>
<tr><td> <em>Caption:</em> <p>User Ahmad can see that Qadeer first muted him and then he unmuted<br>him.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T17.06.22Screenshot%202023-12-13%20at%2012.00.40%E2%80%AFPM.png.webp?alt=media&token=0f998f70-3b48-499f-b3b3-e4aaf15fd601"/></td></tr>
<tr><td> <em>Caption:</em> <p>When messages begin with the command mute or unmute, the sender of the<br>message adds/removes a specific name from their blocklist(mutelist), and then then a message<br>informing that the user is muted/unmuted is sent out<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T17.06.25Screenshot%202023-12-13%20at%2012.01.59%E2%80%AFPM.png.webp?alt=media&token=745d5b28-df0c-44eb-b35e-006cada9d0cb"/></td></tr>
<tr><td> <em>Caption:</em> <p>Helper function which gets the current id for user blocked by name<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>In the sendMessage function, the program examines the &#39;message&#39; string to determine if<br>it starts with either /mute or /unmute. Depending on this condition, the sender&#39;s<br>mute list is modified using the unblock or block functions (which are invoked<br>from the server thread). Following this, the &#39;message&#39; string is adjusted to reflect<br>that the particular client has muted another client. Subsequently, a payload, either BLOCK<br>or UNBLOCK, is dispatched from the server thread by providing the blocked client<br>ID. The modified message is then transmitted to all participants in the room.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T17.20.27Screenshot%202023-12-13%20at%2012.17.49%E2%80%AFPM.png.webp?alt=media&token=84ec1c95-4ae1-46a8-a600-b92f8c2f6f54"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing the user Ahmad and James mutelist that show the muted users grayed<br>out.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T17.25.36Screenshot%202023-12-13%20at%2012.12.10%E2%80%AFPM.png.webp?alt=media&token=0368e92c-dea2-4b4e-9bb8-7fef971ee017"/></td></tr>
<tr><td> <em>Caption:</em> <p>Ahmad send the message the last message “hello” and now he got highlited<br>as red<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T17.25.39Screenshot%202023-12-13%20at%2012.12.37%E2%80%AFPM.png.webp?alt=media&token=346af1d2-7bae-4d60-ab68-c91a384f69ec"/></td></tr>
<tr><td> <em>Caption:</em> <p>After Ahmad send the message, now the last message is sent by Qadeer<br>“this is qadeer” and now he got highlited as red<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-12-13T17.35.27Screenshot%202023-12-13%20at%2012.29.02%E2%80%AFPM.png.webp?alt=media&token=d8ec9e47-d732-48a6-86a4-a6046f6bee7e"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing that muted Ahmad didn&#39;t got highlighted even though he was last person<br>to send message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p><b>ROOM:</b><br>In the room, when clients connect, BLOCK/UNBLOCK payloads are transmitted to convey pre-existing<br>blocklists. These payloads are also dispatched in response to client-initiated mute/unmute commands. On<br>the client side, if the payload is BLOCK/UNBLOCK, the muted/unmuted client ID is<br>forwarded to a function within the clientUI to manage the display of the<br>respective client (blocked users are displayed in grey). Additionally, MESSAGE payloads trigger a<br>function in the UI upon receipt of a message from a specific client,<br>resulting in the last sender&#39;s name being highlighted in red.<br><div><br></div><div><b>clientUI:</b></div>The clientUI, upon receiving<br>the client ID of a blocked/unblocked user, triggers a function in the chat<br>panel to refresh the appearance of the designated blocked user in the user<br>list. When a message is received, the clientID of the last sender is<br>sent to a function in the chat panel, which updates the appearance of<br>the user panel for all recipients. Notably, muted users are excluded from this<br>update, as they would not have received the message. <br><div><br></div><div><b>ChatPanel:</b></div>The ChatPanel, in turn,<br>calls the respective functions in the UserPanel to update the appearance based on<br>whether the user is blocked/unblocked or is the last sender for the given<br>recipient. The UserPanel, responsible for repainting components, renders the component holding the username<br>in grey if muted, and black if unmuted. Following this, the MESSAGE payload<br>is processed, painting the component in red if the user is the last<br>sender of a message for the recipient. Otherwise, the components are painted black<br>if not muted (grey).<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-chatroom-milestone4/grade/qa9" target="_blank">Grading</a></td></tr></table>