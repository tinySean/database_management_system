package common;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			Socket socket = null;
			int count = 0;
			System.out.println("***��������������, �ȴ��ͻ��˵�����***");
			while(true) {
				socket = serverSocket.accept();
				ServerThread serverThread = new ServerThread(socket);
				serverThread.start();
				
				count++;  
				System.out.println("�ͻ�������Ϊ: " + count);
				InetAddress address = socket.getInetAddress();
				System.out.println("��ǰ�ͻ��˵�IP: " + address.getHostAddress());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

