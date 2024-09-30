package C22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C03FileOutputStreamMain {
	public static void main(String[] args) throws IOException {
		OutputStream fout = new FileOutputStream("C:\\TMP_IO\\test.txt"); // 우리가 임의로 확장자를 지정한 것 뿐이지 실제로 엑셀파일에서 원하는대로 값을 넣어준것이 아니다.
		fout.write("가".getBytes(StandardCharsets.UTF_8)); // 문자열은 받아지지 않는다. 공백처리됨
		fout.write('a');
		fout.write('b');
		fout.write('c');
		fout.write('d');
		fout.flush();
		fout.close();
		
	}
}
