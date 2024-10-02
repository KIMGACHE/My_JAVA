package C27;

import java.io.DataInputStream;
import java.net.Socket;

public class ServerRecvThread implements Runnable {
	
	Socket client;
	DataInputStream din; // 보조스트림
	public ServerRecvThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try {
			din = new DataInputStream(client.getInputStream()); // 기본 inputstream을 가져와 보조스트림에 끼워넣는다.
			String recv = null;
			
			while(true) {
				recv = din.readUTF();
				if(recv.equals("q")||recv==null)
					break;
				System.out.println("[CLIENT] : " + recv);
			}
			System.out.println("[INFO] 수신 종료");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
