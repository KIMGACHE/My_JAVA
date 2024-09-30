package C22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C06FileCopyAddBufferMain {
	private static final String DIR = "C:\\TMP_IO\\";

	
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream(DIR+args[0]);
		OutputStream out = new FileOutputStream(DIR+args[1]);
		
		byte[] buffer = new byte[4096]; // 1kbyte buffer
		
		long size = 0;
		long sTime = System.currentTimeMillis();
		while(true) {
			int data = in.read(buffer); // 읽어들이는 단위를 buffer단위로 읽는다. 한 문자씩 읽는 것과 속도 차이가 차이가 크다.
			if(data==-1)
				break;
			out.write(buffer, 0, data); // buffer단위로 쓰기. 속도차이 많이남
			out.flush();
		}
		long eTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (eTime-sTime)+" ms");
		in.close();
		out.close();
	}
}

