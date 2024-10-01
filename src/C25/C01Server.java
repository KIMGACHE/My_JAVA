package C25;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {

	public static void main(String[] args) throws IOException {
		// Collection , JDBC(시험칠때 필요하니까 쓰니까 암기) 
		
		// 서버 소켓 생성
		ServerSocket server = new ServerSocket(7000); // 몇번 포트를 사용하여 구분되어질 것인지 지정
		System.out.println("[INFO] SERVER SOCKET LISTENING");
		
		while(true) {
			Socket client = server.accept(); // client로부터 요청이 왔을 때 연결을 수락할 때 사용한다.
			System.out.println("[INFO] SERVER ACCEPTED... CLIENT IP : " + client.getInetAddress());
			OutputStream out =  client.getOutputStream(); // Byte단위로 전송가능
			DataOutputStream dout = new DataOutputStream(out); // 문자열전송을 위해 보조스트림 사용
			dout.writeUTF("WELCOME TO SERVER!");
			
			dout.close();
			out.close();
			client.close();
		}
//		server.close();
	}

}
