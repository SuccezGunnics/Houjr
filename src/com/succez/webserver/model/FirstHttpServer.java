package com.succez.webserver.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.succez.practice.Buf2Array;

public class FirstHttpServer {
	
	public void service(int port) throws IOException{
		ServerSocket server = new ServerSocket(port);
		while(true){
			Socket client = server.accept();
			ServerThread serverthread = new ServerThread(client);
			serverthread.start();
		}
	}
	
	public static void main(String[] args) {
		try {
			new FirstHttpServer().service(2016);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class ServerThread extends Thread{
	
	private Socket client;
	
	public ServerThread(Socket client){
		this.client = client;
	}
	
	@Override
	public void run(){
		InputStream in = null;
		OutputStream out = null;
		BufferedReader reader = null;
		
		try {
			in = client.getInputStream();
			reader = new BufferedReader(new InputStreamReader(in));
			int readint;
			byte[] buf = new byte[1024];
			OutputStream os = client.getOutputStream();
			client.setSoTimeout(50);
			byte[] data = null;
			String queryresource;
			String head;
			
			queryresource=getQueryResource();
			head=getHead(queryresource);
			
			while (true) {
				try {
					if ((readint = in.read(buf)) > 0) {
					} else if (readint < 0)
						break;
				} catch (InterruptedIOException e) {
					data = (byte[]) Buf2Array.file2bufByFIS(new File(("webroot"+queryresource))).getResultObj();
				}

				if (data != null) {
					os.write(head.getBytes("utf-8"));
					os.write(data);
					os.close();
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private String getHead(String queryresource) {
		return "HTTP/1.0200OK\n"+"Content-Type:text/html\n" + "Server:myserver\n" + "\n";
	}

	private String getQueryResource() {
		return "/index.html";
	}
	
}