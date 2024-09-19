package C05;
import java.util.Scanner;
public class C05Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ctrl + shift + o : 자동 importing
		
		// System.out : 운영체제가 관리하고 있는 자원들 중에 표준 출력 스트림
		// System.in : 운영체제가 관리하고 있는 자원들 중에 표준 입력 스트림
		// 스트림 : 데이터의 전송흐름, 단방향
		
		// new Scanner(System.in)
		// 표준 입력장치(키보드)로부터 전달되는 데이터를 받을 수 있는 Scanner객체를 생성
		// Scanner sc = new Scanner(System.in)
		// Scanner 객체를 main함수내에서 제어(접근,사용)할 수 있도록 sc변수에 위치정보를 저장
		System.out.print("입력 : ");
		int n1 = sc.nextInt();
//		System.out.println("n1  : " + n1);
		int n2 = sc.nextInt();
//		System.out.println("n2  : " + n2);
		int n3 = sc.nextInt();
//		System.out.println("n3  : " + n3);
		int n4 = sc.nextInt();
//		System.out.println("n4  : " + n4);
		System.out.printf("%d %d %d %d",n1,n2,n3,n4);
		
	}
}
