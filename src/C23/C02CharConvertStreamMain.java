package C23;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C02CharConvertStreamMain {

	public static void main(String[] args) throws IOException {
		// 보조스티림 : 다른 스트림과 연결이 되어 여러 편리한 기능을 제공
		// 단독으로는 사용 불가, 기본 입출력 소스와 함께 사용
		
		String str = "문자 변환 스트림 사용"; // 문자 변환 스트림
		
		OutputStream out = new FileOutputStream("c:\\TMP_IO\\test.txt"); //기본 아웃풋 스트림
		OutputStreamWriter wout = new OutputStreamWriter(out); // 캐릭터형으로 바꾸는 보조스트림
		BufferedWriter bout = new BufferedWriter(wout); // 버퍼를 통해 더 빨리 보내는 보조스트림(?) , 여러개의 보조스트림을 사용할 수 있다.
		bout.write(str);
		bout.flush();
		bout.close();

		InputStream in = new FileInputStream("c:\\TMP_ID\\test.txt");
		BufferedInputStream bin =new BufferedInputStream(in);
		InputStreamReader ring = new InputStreamReader(bin);
		int dada;
		while(true) {
			dada = bin.read();
			if(data==-1)
				break;
			System.out.print((char)data);
		}
		
	}

}
