package C22;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class C08URLStreamMain {
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		// URL 객체생성(Deprecated...)
//		URL url = new URL("https://n.news.naver.com/mnews/article/215/0001181544");
		URL url = (new URI("https://n.news.naver.com/mnews/article/215/0001181544")).toURL(); // 요새는 이걸 사용한다고 함
		
		// 스트림 꺼내기
		InputStream bin = url.openStream();
		
		// 보조스트림
		BufferedInputStream buffIn = new BufferedInputStream(bin); // 보조스트림, 버퍼공간 단위로 수신
		Reader in = new InputStreamReader(buffIn); // 보조스트림, byte단위 -> char단위로 변환
		
		// 확인
		Writer out = new FileWriter("C:\\TMP_IO\\index.html");
		while(true) {
			int data = in.read();
			if(data==-1)
				break;
			out.write((char)data);
		}
		out.flush();
		out.close();
		in.close();
		buffIn.close();
		bin.close();
		
	}
}
