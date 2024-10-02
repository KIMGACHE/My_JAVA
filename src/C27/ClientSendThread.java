package C27;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSendThread implements Runnable {

	Socket server;
	Scanner sc;
	DataOutputStream dout;
	public ClientSendThread(Socket server) {
		this.server = server;
		this.sc = new Scanner(System.in);
	}

	@Override
	public void run() {
		try {
			dout = new DataOutputStream(server.getOutputStream()); // 기본 outputstream을 보조스트림에 끼워넣는다.
			String send;
			while(true) {
				System.out.print("[CLIENT(q:종료)] : ");
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
