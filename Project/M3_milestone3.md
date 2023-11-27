<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Qadeer Ahmad (qa9)</td></tr>
<tr><td> <em>Generated: </em> 11/27/2023 2:25:42 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-chatroom-milestone3/grade/qa9" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-26T21.54.29Screenshot%202023-11-26%20at%204.53.54%E2%80%AFPM.png.webp?alt=media&token=71007273-1eb8-48cc-92d7-cbb5ec027599"/></td></tr>
<tr><td> <em>Caption:</em> <p>Host and Port shown in the UI<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-26T21.55.57Screenshot%202023-11-26%20at%204.54.04%E2%80%AFPM.png.webp?alt=media&token=7137e865-6989-4ae4-99bf-377281efcf67"/></td></tr>
<tr><td> <em>Caption:</em> <p>Username shown in UI<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-26T21.57.19Screenshot%202023-11-26%20at%204.57.10%E2%80%AFPM.png.webp?alt=media&token=7bf5b46e-acc9-41f9-b59f-514c4235c4d5"/></td></tr>
<tr><td> <em>Caption:</em> <p>First User &quot;James&quot; Entering in the lobby room<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly 
explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <p>1- Host and port shown:<br><div>The client UI creates an instance of the class<br>ConnectionPanel, which extends Jpanel, and clicks the Jbutton &quot;next&quot; to establish a connection<br>with the server. The functions getHost and getPort (used in the connect function<br>in ClientUI to connect the client itself) retrieve the port value and host<br>value from the text field and provide them to the user interface.</div><div><br></div>2- Username<br>entry by the client:<br><div>When the user clicks the &quot;connect&quot; Jbutton, an instance of<br>the class UserInputPanel (which extends Jpanel) is generated, collects the username from the<br>textfield, and connects them to the lobby.</div><div><br></div><div>3- The client enters the room:</div>On the<br>left side of the screen, the userListPanel displays the people who have entered<br>the room. As users leave and return the room, it clears and adds<br>them.<br>As display messages in HTML format are transmitted, the chatPanel listens for them.<br><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-26T22.09.44Screenshot%202023-11-26%20at%205.08.24%E2%80%AFPM.png.webp?alt=media&token=5bde0439-546e-4b93-81f6-f74ef728ecb8"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing the list of the Users, Chat History, Create Message area and Send<br>Button.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T01.04.11Screenshot%202023-11-26%20at%207.57.18%E2%80%AFPM.png.webp?alt=media&token=2c180fde-5e1b-4645-a905-a7d83f068618"/></td></tr>
<tr><td> <em>Caption:</em> <p>Screenshot of the code that puts the message through UI to chat panel<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T01.04.13Screenshot%202023-11-26%20at%208.03.58%E2%80%AFPM.png.webp?alt=media&token=122c9943-0b1a-4336-a4b7-728c2b1b3aa5"/></td></tr>
<tr><td> <em>Caption:</em> <p>Screenshot of the code which listens for input to jbutton &quot;send&quot; to send<br>message<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T01.37.16Screenshot%202023-11-26%20at%208.36.03%E2%80%AFPM.png.webp?alt=media&token=eeec0c52-4b71-4147-aff4-3e7a5abf8f5f"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing the flip and roll output with different color and text format<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T01.46.02Screenshot%202023-11-26%20at%208.41.43%E2%80%AFPM.png.webp?alt=media&token=6e75738c-1529-4d40-a2ea-0ae6f3d3a6e7"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server side code of flip and roll generation<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T01.46.05Screenshot%202023-11-26%20at%208.45.44%E2%80%AFPM.png.webp?alt=media&token=c7d9a92a-32b0-4fc5-a9c8-08ee00c3001f"/></td></tr>
<tr><td> <em>Caption:</em> <p>Change Text format logic in flip and roll method<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <div>The code initially checks whether a message begins with a slash (/). If<br>the command is "/roll," it extracts the second part of the command. The<br>code then determines if the command is in the format "/roll [number]d[number]"; if<br>so, it sends the two extracted numbers as arguments to the "roll()" function.<br>If the format is "/roll [number]," it sends 1 as the first argument<br>for a single die and the extracted number as the second argument for<br>the number of sides. The "roll()" function generates a random result based on<br>the die's sides, repeating the process for each die, and returns the result<br>as a string. The code uses regular expressions to distinguish between the two<br>formats and passes the appropriate parameters. If the command is "/flip," the code<br>calls the "flip()" function, which generates a random number between 0 and 1<br>and returns "heads" or "tails" as a string. Formatting is applied after processing<br>commands and before sending messages.<br></div><div><br></div><div>Format&gt; HTML tags</div><div>Bold = &lt;b&gt;&lt;/b&gt;</div><div>Italic = &lt;i&gt;&lt;/i&gt;</div><div>Underline = &lt;u&gt;&lt;/u&gt;</div><div>Color<br>= &lt;style = color: ????</div><div><br></div><div>Each section of the code is enclosed with HTML<br>tags to generate the expected output. Proper nesting is maintained, and after each<br>round of replacing outer markdown patterns, the code iteratively checks the updated message<br>for any remaining regex matches within the markdown. These formatted messages are then<br>transmitted as payloads to the server under the designation "MESSAGE" and subsequently relayed<br>from the server to other clients.<br></div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T15.39.52Screenshot%202023-11-27%20at%2010.39.18%E2%80%AFAM.png.webp?alt=media&token=daee0022-62da-42db-9d97-d32db960d548"/></td></tr>
<tr><td> <em>Caption:</em> <p>The chat area output showing the Bold, Italic, Underline and Color and all<br>the Markdown Combined<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <p>The text is incorporated into the JEditorPane within the chat panel in HTML<br>format. As the text is treated as HTML, the conversion of my markdown<br>to HTML tags ensures proper rendering. This approach ensures that the formatted content<br>displays correctly in the JEditorPane.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T16.44.24Screenshot%202023-11-27%20at%2011.37.49%E2%80%AFAM.png.webp?alt=media&token=2b16f38d-7ecc-43e3-8417-995b20895616"/></td></tr>
<tr><td> <em>Caption:</em> <p>Sent Private Message From Qadeer to James<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T16.47.04Screenshot%202023-11-27%20at%2011.46.28%E2%80%AFAM.png.webp?alt=media&token=c89fa0bb-80de-4cb7-beae-c72ef88b1024"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing Code that check message starts with &quot;@&quot; and then Implement according to<br>it<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T16.47.07Screenshot%202023-11-27%20at%2011.46.45%E2%80%AFAM.png.webp?alt=media&token=d7bb73de-505e-45db-882e-a6f212da2985"/></td></tr>
<tr><td> <em>Caption:</em> <p>Show the two Method &quot;sendPrivateMessage&quot; and &quot;sendPublicMessage&quot;<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>The initial step involves processing the command if it commences with &quot;@&quot;. Utilizing<br>regular expressions, the string is split to extract the recipient&#39;s name and their<br>corresponding message. Subsequently, the &quot;sendPrivateMessage()&quot; function is invoked, navigating through all clients. The<br>function dispatches the message to the client whose name aligns with the specified<br>recipient. However, the message is also sent to the original sender, contingent on<br>the condition that the recipient has not included the sender in their mutelist<br>or blocklist.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T19.02.07Screenshot%202023-11-27%20at%201.49.51%E2%80%AFPM.png.webp?alt=media&token=055c2a3f-9d5c-41f0-b1e2-9dab9fd7ebd5"/></td></tr>
<tr><td> <em>Caption:</em> <p>&quot;Tom&quot; Muted &quot;Qadeer&quot; and when Qadeer send message in the room &quot;Tom&quot; will<br>not get the message, But when &quot;Tom&quot; Unmute the &quot;Qadeer&quot;, &quot;Tom&quot; will now<br>gets the message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T19.12.24Screenshot%202023-11-27%20at%202.07.10%E2%80%AFPM.png.webp?alt=media&token=61da09f6-7a96-4764-98d3-02d0099a694d"/></td></tr>
<tr><td> <em>Caption:</em> <p>Using the getBlockedList() method to get the mute list to prevent message from<br>muted users<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fqa9%2F2023-11-27T19.12.30Screenshot%202023-11-27%20at%202.10.02%E2%80%AFPM.png.webp?alt=media&token=0256c56a-f5a9-46c2-bffc-311ff038b392"/></td></tr>
<tr><td> <em>Caption:</em> <p>serverThread method &quot;block()&quot; and &quot;unblock()&quot; which interact with Room which is shown in<br>first screenshot.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>Each instance of a server thread possesses a mutelist, and within it, there<br>are two functions: &quot;block(String clientname)&quot; and &quot;unblock(String clientname).&quot; These functions enable the addition<br>or removal of clients from their respective blocklists. The Room class incorporates these<br>functions, such that when a user executes the &quot;/mute clientname&quot; command, the user<br>is added to the blocklist by invoking the appropriate function. Similarly, executing the<br>&quot;/unmute clientname&quot; command removes the specified name from the blocklist.<br><br>In the process of<br>sending messages, whether publicly or privately, the system iterates through each client. During<br>this iteration, there&#39;s a continual check to ascertain whether the sender is included<br>in the blocklist of each client before dispatching the message. This ensures that<br>messages are only sent to clients who haven&#39;t blocked the sender, maintaining the<br>integrity of the blocklist functionality. This works great.<br><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 7: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull request from milestone3 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/healer3771/qa9-it114-003/pull/15">https://github.com/healer3771/qa9-it114-003/pull/15</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-003-F23/it114-chatroom-milestone3/grade/qa9" target="_blank">Grading</a></td></tr></table>