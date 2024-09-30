package C22;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {
	public static void main(String[] args) throws IOException {
		// 파일입출력
		// 문자 스트림 (2byte) - Reader, Writer : txt파일 확장자
		// 바이트 스트림 (1byte) - InputStream, OutputStream
		
		Writer fout = new FileWriter("C:\\TMP_IO\\test1.txt", true); // 파일이 존재하지 않으면 파일을 생성함, 기본값은 덮어 쓰기다.
		fout.write("HELLOWORLD\n"); // test1을 4줄쓰더라도 다음에 write를 그냥 쓰면 4줄이 모두 날아가고 hellowolrd만 남는다. 그래서 true를 넣어주면 덮어쓰기가 아닌 추가로 쓴다. 기본값은 false다.
//		fout.write("TEST1\n");
//		fout.write("TEST1\n");
//		fout.write("TEST1\n");
//		fout.write("TEST1\n");
		fout.flush();		// buffer 공간을 초기화
		fout.close();		// 닫기?
	}
}
