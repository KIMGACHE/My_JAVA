package C22;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C02FileCopyMain {
	
	private static final String DIR = "C:\\TMP_IO\\";
	
	// 명령어 원본경로 저장대상경로 -> 이런식으로 명령어처럼 사용할 거임
	public static void main(String[] args) throws IOException { // 해당 java파일 우클릭 Run as -> configuration에 arguments
		for(String arg:args)
			System.out.println(arg);
		
		Reader in = new FileReader(DIR+args[0]); // c드라이브 TMP_IO라는 폴더에 args[0]값의 이름을 가진 파일이 존재해야함
		Writer out = new FileWriter(DIR+args[1]); // c드라이브 TMP_IO라는 폴더에 args[1]값의 이름을 가진 파일로 복사함.
		
		while(true) {
			int data= in.read();
			if(data==-1)
				break;
			out.write((char)data);
			out.flush();
		}
		in.close();
		out.close();
	}

}
