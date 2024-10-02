package C27;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9000);
		System.out.println("[INFO] SERVER SOCKET START!..");
		
		Socket client = server.accept();
		
		// client로부터 받거나 client에게 전송을 해야하므로 client객체를 매개변수로 넣었음
		ServerRecvThread recv = new ServerRecvThread(client);
		ServerSendThread send = new ServerSendThread(client);
		// main thread와 분할
		Thread th1 = new Thread(recv);
		Thread th2 = new Thread(send);
		//
		th1.start();
		th2.start();
		// 대기 상태
		th1.join();
		th2.join();
	}
}
