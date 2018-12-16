package chatapplication;

import java.net.*;
import java.io.*;

public class ClientHandler extends Thread {
	private Socket socket;
	private DataOutputStream output;
	
	public ClientHandler(Socket socket) {
		this.socket = socket;
		try {
			this.output = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			this.output = null;
		}
	}
	
	public void run() {
		if (output == null) {
			return;
		} else {
			try {
				// NOTE: The second byte of each character is lost.
				output.writeBytes("Get off my lawn");
				socket.close();
			} catch (IOException e) {
				return;
			}
		}
	}
}
