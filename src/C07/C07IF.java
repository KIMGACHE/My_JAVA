package C07;


import java.util.Scanner;

public class C07IF {
	public static void main(String[] args) {
		// IF기본
		//IF(조건식)
		//{
		//  참인경우 실행되는 종속문장
		//}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age >=8) {
//			System.out.println("학교에다닙니다.");
//		}
//		System.out.println("첫번째 IF 블럭종료");
//		if(age<8) {
//			System.out.println("학교에 다니지 않습니다.");
//		}
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다.");
		
		// IF_ELSE
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age >=8) {
//			System.out.println("학교에다닙니다.");
//		} else {
//			System.out.println("학교에 다니지 않습니다.");
//		}
//		System.out.println("첫번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다.");
		
		// 문제
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if(num%3==0) System.out.println(num);
//		// 3의 배수이면서 5의 배수라면 출력
//		if(num%3==0 && num%5==0) System.out.println(num);
		
		// 문제
		// 두 수를 입력받아 두 수 중에 큰 수를 출력
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int temp = (num1>num2) ? num1 : num2;
//		System.out.println("문제 1번 정답 : " + temp);
//		// 세 개의 정수를 입력받아 해당수의 합과 평균을 출력
//		int num3 = sc.nextInt();
//		int num4 = sc.nextInt();
//		int num5 = sc.nextInt();
//		int sum = num3+num4+num5;
//		double avg = (1.0)*sum/3;
//		System.out.printf("문제 2번 정답 : %d, %f\n",sum,avg);
//		// 세 개의 정수를 입력받아 가장 큰 수와 가장 작은 수를 각각 출력
//		int num6 = sc.nextInt();
//		int num7 = sc.nextInt();
//		int num8 = sc.nextInt();
//		int[] arr = {num6, num7, num8};
//		int max=0;
//		int min=2147483647;
//		for(int i=0; i<3; i++) {
//			if(min>arr[i]) min = arr[i];
//			if(max<arr[i]) max = arr[i];
//		}
		
		
//		System.out.printf("문제 3번 정답 - min: %d, max: %d",min,max);
		
		// IF_ELSEIF_ELSEIF
//		Scanner sc = new Scanner(System.in);
//		int 과목1 = sc.nextInt();
//		int 과목2 = sc.nextInt();
//		int 과목3 = sc.nextInt();
//		int 과목4 = sc.nextInt();
//		double 평균 = (double)(과목1+과목2+과목3+과목4)/4;
//		
//		// 질문을 어떻게 던질것인지에 따라 코드가 달라진다.
//		if(과목1<40) {
//			System.out.println("불합격");
//		} else if(과목2<40) {
//			// 과목1>=40, 과목2<40
//			System.out.println("불합격");
//		} else if(과목3<40) {
//			// 과목1>=40, 과목2>=40, 과목3<40
//			System.out.println("불합격");
//		} else if(과목4<40) {
//			// 과목1>=40, 과목2>=40, 과목3>=40, 과목4<40
//			System.out.println("불합격");
//		} else if(평균<60) {
//			// 과목1>=40, 과목2>=40, 과목3>=40, 과목4>=40, 평균<60
//			System.out.println("불합격");
//		} else {
//			// 과목1>=40, 과목2>=40, 과목3>=40, 과목4>=40, 평균>=60
//			System.out.println("합격");
//		}
//		
//		if( 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4>=40 && 평균 >=60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
		// 문제
		// 시험 점수를 입력받아 90~100점은 A
		// 80~89점은 B, 70~79점은 C,
		// 60~69점은 D, 나머지 점수는 F를 출력하는 프로그램을 만드시오.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>=90) {
			System.out.println('A');
		} else if(num>=80) {
			System.out.println('B');
		} else if(num>=70) {
			System.out.println('C');
		} else if(num>=60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
		
	}
}
