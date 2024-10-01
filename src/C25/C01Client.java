package C25;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class C01Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket server = new Socket("192.168.5.50",7000); // 서버에 연결요청 -> 이걸 server의 accept가 받는다.
		InputStream in = server.getInputStream();
		DataInputStream din = new DataInputStream(in); // server에서 DataOutputStream으로 보내기때문에 이쪽에서도 이걸로 읽는다.
		String recv = din.readUTF();
		System.out.println("서버 메세지 : " + recv);
		
		
		din.close();
		in.close();
		server.close();
	}

}
