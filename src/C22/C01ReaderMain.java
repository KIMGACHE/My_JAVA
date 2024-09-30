package C22;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01ReaderMain {

	public static void main(String[] args) throws IOException {
		// Reader의 read()함수는 반환타입이 int이다. (단일 문자를 하나 읽어와 유니코드 값(0~65535)을 리턴함), 읽을 문자가 없으면 -1을 리턴
		Reader fin = new FileReader("C:\\TMP_IO\\test1.txt");
		StringBuffer buffer = new StringBuffer();
		int data;
		while((data=fin.read())!=-1) {
//			int data = fin.read();
//			if(data==-1)
//				break;
//			System.out.print((char)data);
			buffer.append((char)data);
		}
		System.out.println(buffer);
		fin.close();
	}

}
