package C25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class C02Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket server = new Socket("192.168.5.50", 9002);
		
		DataInputStream din = new DataInputStream(server.getInputStream()); // IN
		DataOutputStream dout = new DataOutputStream(server.getOutputStream()); // Out
		
		Scanner sc = new Scanner(System.in);
		String send = null;
		String recv = null;
		
		while(true) { // simgle thread임
			// 송신
			System.out.print("[ME(q:종료)] : ");
			send = sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			if(send.equals("q"))
				break;
			// 수신
			recv = din.readUTF();
			if(recv==null || recv.equals("q"))
				break;
			System.out.println("[SERVER] : " + recv);
			
		}
	}
}
