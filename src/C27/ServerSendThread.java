package C27;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerSendThread implements Runnable {

	Socket client;
	Scanner sc;
	DataOutputStream dout;
	public ServerSendThread(Socket client) {
		this.client = client;
		this.sc = new Scanner(System.in);
	}

	@Override
	public void run() {
		try {
			dout = new DataOutputStream(client.getOutputStream()); // 기본 outputstream을 보조스트림에 끼워넣는다.
			String send;
			while(true) {
				System.out.print("[Server(q:종료)] : ");
				send = sc.nextLine();
				dout.writeUTF(send);
				dout.flush(); // write는 반드시 flush로 비워줘야 한다.
				if(send.equals("q"))
					break;
				
			}
			System.out.println("[INFO] 송신 종료");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
