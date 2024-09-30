package C22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C03FileInputStreamMain {
	public static void main(String[] args) throws Exception {
		InputStream fin = new FileInputStream("C:\\TMP_IO\\data.xlsx"); // 이전에는 FileReader(2byte)인듯?
		
		long size = 0;
		long sTime = System.currentTimeMillis();
		while(true) {
			int data = fin.read(); // 1byte이므로 8bit니까 0~255사이의 숫자를 반환한다, 파일의 끝에서 -1을 반환한다. 그래서 한글같은건 깨질 수도 있다.
			if(data==-1)
				break;
			System.out.println((char)data);
			size++;
		}
		long eTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (eTime-sTime)+" ms");
		System.out.println("파일크키 : " + (size*1.0)/(1024*1024) + " MB");
	}
}
