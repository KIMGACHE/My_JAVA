package C08;

import java.util.Scanner;

public class C08WHILE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 01 while 기본
		// while(조건식) {
		// 조건식이 참인 경우 실행되는 종속 문장(1개의 행일 때는 생략가능)
		// }
		
		// 탈출용 변수
		// 탈출을 위한 조건식
		// 탈출을 위한 연산식
		
//		int count=0; // 탈출용 변수
//		while(count<5) { // 탈출을 위한 조건식
//			System.out.println("HELLO WORLD");
//			count++; // 탈출을 위한 연산식
//		}
//		
//		// 1~10까지의 합
//		int i = 1;
//		int sum = 0;
//		while(i<=10) {
//			sum+=i;
//			i++;
//		}
//		System.out.println("sum = "+sum);
		
		// 1-N 까지의 합
//		int i = 1;
//		int N = sc.nextInt();
//		int sum = 0;
//		while(i<=N) {
//			sum+=i;
//			i++;
//		}
//		System.out.printf("1-%d까지의 합 : %d\n",N,sum);
		
		// N-M까지의 합
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		
//		int min = Math.min(N, M);
//		int max = Math.max(N, M);
//		int sum = 0;
//		while(min<=max) {
//			sum+=min;
//			min++;
//		}
//		System.out.printf("%d - %d 까지의 합 : %d\n",N,max,sum);
		
		// 1-N까지 수중에 짝수/홀수의 합을 각각 출력
//		int i = 1;
//		int N = sc.nextInt();
//		int sumE = 0;
//		int sumO = 0;
//		while(i<=N) {
//			if(i%2==0) {
//				sumE +=i;
//			} else {
//				sumO +=i;
//			}
//			i++;
//		}
		
		// 1-N까지 수중에 3의 배수만 출력하고 그 합도 출력
//		int i = 1;
//		int N = sc.nextInt();
//		int sum = 0;
//		while(i<=N) {
//			if(i%3==0) {
//				System.out.printf("%d ",i);
//				sum +=i;
//			}
//			i++;
//		}
//		System.out.println();
//		System.out.printf("1-%d까지 3배수의 합 : %d\n",N,sum);
		
		// 1-N까지 수중에 4의 배수만 출력하고 그 합도 출력
//		int i = 1;
//		int N = sc.nextInt();
//		int sum = 0;
//		while(i<=N) {
//			if(i%4==0) {
//				System.out.printf("%d ",i);
//				sum +=i;
//			}
//			i++;
//		}
//		System.out.println();
//		System.out.printf("1-%d까지 4배수의 합 : %d\n",N,sum);
		
		// 구구단 2단 출력
//		int i = 1;
//		while(i<=9) {
//			System.out.printf("2 x %d = %d\n",i,2*i);
//			i++;
//		}
		
		// 구구단 N단 출력
//		int i = 1;
//		int N = sc.nextInt();
//		while(i<=9) {
//			System.out.printf("%d x %d = %d\n",N,i,N*i);
//			i++;
//		}
	}

}
