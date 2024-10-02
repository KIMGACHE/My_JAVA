package C27;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	public static void main(String[] args) throws Exception {
		//
		Socket server = new Socket("ServerIP",9000);
		
		// client로부터 받거나 client에게 전송을 해야하므로 client객체를 매개변수로 넣었음
		ClientRecvThread recv = new ClientRecvThread(server);
		ClientSendThread send = new ClientSendThread(server);
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
