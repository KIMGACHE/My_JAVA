package C23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class C03PrintWriterMain {

	public static void main(String[] args) throws IOException {
		Writer out = new FileWriter("c:\\TMP_IO\\test2.txt");
		BufferedWriter bout = new BufferedWriter(out);
		PrintWriter pout = new PrintWriter(bout);
		pout.println("HELLO"); // 화면으로 프린트되는게 아니라 파일로 프린트됨
		pout.println("HELLO");
		pout.println("HELLO");
		pout.println("HELLO");
		pout.flush();
		pout.close();
		
		Reader in = new FileReader("c:\\TMP_IO\\test2.txt");
		BufferedReader bin = new BufferedReader(in);
		
		while(true) {
			String data = bin.readLine(); // readLine()은 개행단위로 읽어온다.
			if(data==null)
				break;
			System.out.println(data);
		}
	}

}
