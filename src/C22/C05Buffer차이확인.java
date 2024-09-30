package C22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C05Buffer차이확인 {
	public static void main(String[] args) throws Exception {
		InputStream fin = new FileInputStream("C:\\TMP_IO\\data.xlsx");
		
		byte[] buffer = new byte[1024]; // 1kbyte buffer
		
		long size = 0;
		long sTime = System.currentTimeMillis();
		while(true) {
			int data = fin.read(buffer); // 읽어들이는 단위를 buffer단위로 읽는다. 한 문자씩 읽는 것과 속도 차이가 차이가 크다.
			if(data==-1)
				break;
			System.out.println(data);
			size++;
		}
		long eTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (eTime-sTime)+" ms");
		System.out.println("파일크키 : " + (size*1.0)/(1024*1024) + " MB");
	}
}
