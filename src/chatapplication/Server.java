package chatapplication;

import java.net.*;
import java.io.*;

public class Server {
	public static final int port = 42069;
	
	public static void main(String[] args) throws Exception {
		System.out.println("Starting server...");
		
		ServerSocket servSock = new ServerSocket(port);
		
		while (true) {
			new ClientHandler(servSock.accept()).start();
		}
	}
}
