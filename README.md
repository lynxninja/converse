# converse
A simple command-line chat program

Features:
- (it doesn't do anything yet)

Operation:
- Server opens a ServerSocket and starts the MessageStorageThread
- Client connects to the ServerSocket
- Server hands the ServerSocket off to a SocketThread
- Server is open for another connection
- SocketThread begins listening for messages from Client, upon receiving one it will be sent to the MessageStorageThread for storage
- SocketThread begins periodically sending the current chat ID (array index of the newest message) to the client
- If the client responds to the SocketThread if the chat ID is higher than it's local ID
- SocketThread responds to an out-of-date message with the 'missing' messages
- Client updates itself

Update Log:
- no versions yet
