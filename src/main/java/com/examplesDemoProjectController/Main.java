package com.examplesDemoProjectController;

import io.helidon.microprofile.server.Server;

public class Main {
	
	public static void main(String[] args) {
		
		Server server = startServer();
		System.out.println("http://localhost:"+server.port());
	}

	public static Server startServer() {
		return Server.create().start();
	}
}
