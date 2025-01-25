# Global Chatroom Application
• The concept of Payloads will continue to be utilized

    Base Payload class for applicable messages/actions

    RollPayload class for the roll commands (below)

    Each payload will be presented by debug output

• Create client-side commands that’ll process user intentions

     Commands will extract the data, wrap it in a Payload (or subclass) and pass it to the ServerThread
 
     ServerThread will interpret the payload, extract the data, and pass it to the necessary Room method
 
     Room will do the actual command process
 
     The Client initiating the command will see the original message
 
    Each command will specify who initiated it and the output

    /roll will handle two different formats

      Format 1: /roll #

        Example: /roll 100

        You determine the range starting value (0 or 1)

        Example output: “Bob rolled 50 and got 25”

      Format 2: /roll #d#

        Example: /roll 2d6

        Example output: “Bob rolled 2d6 and got 2”

    /flip will return heads or tails (like a coin toss)

      Example output: “Bob flipped a coin and got tails”

• Text Formatting: Create a server-side function that processes messages to change text display/format that’s sent to all clients (for this milestone just show the altered text 
symbols, we won’t be able to see the effects until Milestone 3 the given TextFX class is not a solution for this)

    Formats

      Bold

      Italics

      Underline

      Color (at least Red, Green, Blue options or code to support color hex codes)

     Having the user type out html tags is not valid for this feature, instead treat it like WhatsApp, Discord, Markdown, etc
 
     Each text trigger must wrap the text that you want to affect
 
     Slash commands are not an accepted solution, the text must be transformed
 
     You do not need to use the same symbols in the below example, it’s just an example, also, the below example doesn’t show the “correct” output for colors, I’m leaving the proper conversion up to research on your own.
 
    Example Input: This is **bold** and *italic* along with _underlined_ with colored text such as #r red r#, #b blue b#, and #g green g# and must support a combination of all formats + color like **_*#r this is bold, underline, italic, and red r#*_**.

    Example Output: This is <b>bold</b> and <i>italic</i> along with <u>underlined</u> with colored text such as <red>red</red>, <blue>blue</blue>, and <green>green</green> and must support a combination of all formats + color like <b><u><i><red> this is bold, underline, italic, and red </red></i></u></b>.

