package C23;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class C04DataInoutStreamMain {

	public static void main(String[] args) throws IOException {
//		FileOutputStream out = new FileOutputStream("C:\\TMP_IO\\test3.txt");
//		DataOutputStream dout = new DataOutputStream(out); // 해당 보조스트림을 사용하면 특정 자료형을 넣을 수 있다.
//		dout.writeUTF("홍길동"); // 대신 읽어들일때도 순서대로 자료형을 써줘야한다.
//		dout.writeDouble(95.5);
//		dout.writeInt(100);
//		dout.flush();
//		dout.close();

		FileInputStream in = new FileInputStream("C:\\TMP_IO\\test3.txt");
		DataInputStream din = new DataInputStream(in);
		String name = din.readUTF(); // 쓸 때 썼던 자료형대로 읽어온다.
		System.out.println(name);
		double weight = din.readDouble();
		System.out.println(weight);
		int data = din.readInt();
		System.out.println(data);
	}

}
