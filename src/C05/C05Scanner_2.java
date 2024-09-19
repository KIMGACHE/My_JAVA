package C05;

import java.util.Scanner;

public class C05Scanner_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("입력된 정수 값 : "+ num1);
//		
//		System.out.print("실수 입력 : ");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : "+ num2);
//		
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next(); // 문자열 입력받기 기능 함수, 띄어쓰기는 포함하지 않는다.
//		System.out.println("입력된 문자열 : "+ str1);
//		System.out.println("입력 : ");
//		String s1 = sc.next();
//		String s2 = sc.next();
//		String s3 = sc.next();
//		System.out.printf("문자열 : %s %s %s\n",s1,s2,s3);
		
//		System.out.print("문자열 입력 : ");
//		String str2 = sc.nextLine();
//		System.out.println("문자열 : " + str2);
		
		System.out.print("정수 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("입력된 정수 값 : "+ n1);
		
		System.out.print("실수 입력 : ");
		double n2 = sc.nextDouble();
		System.out.println("입력된 실수 값 : "+ n2);
		
		// 여기서 문제발생
		sc.nextLine(); // 이전에 scanner를 사용하고 nextLine()을 쓰려면 이렇게 의미없는 nextLine()을 한번 둔다. 
		System.out.print("문자열입력 : ");
		String str2 = sc.nextLine(); // 이전에 받은 값들의 \n이 buffer에 남아있는데 nextLine()은 \n을 기점으로 입력을 받아오므로 텅빈 값을 가져오게된다.
		System.out.println("문자열 : " + str2);
		System.out.print("문자열입력 : ");
		
		String str = sc.next();
		System.out.println("문자열 : " + str);
		System.out.println("프로그램을 종료합니다..");
	}
}
