package C08;

import java.util.Scanner;

public class C08Continue_Break {
	public static void main(String[] args) {
		// break : 가장 가까이 있는 반복문을 탈출한다.
		
		// -1을 입력하기 전까지 계속 정수값을 받아 누적 합 계산
//		Scanner sc = new Scanner(System.in);
//		int n;
//		int sum = 0;
//		while(true) {
//			n = sc.nextInt();
//			if(n == -1)
//				break;
//			sum+=n;
//		}
//		System.out.println("Sum : " + sum);
		
		// 전체 구구단 출력 (7 X 7 = 49까지만 출력)
//		boolean isExit = false;
//		int dan = 2;
//		while(dan<=9) {
//			int count = 1;
//			while(count<=9) {
//				System.out.printf("%d X %d = %d\n",dan,count,dan*count);
//				// break 사용 dan: 7, count: 7 -> 8단, 9단은 실행됨
//				// flag 변수를 두기 > isExit
//				if(dan==7 && count ==7) {
//					isExit = true;
//					break;
//				}
//				count++;
//				
//			}
//			if(isExit)
//				break;
//			dan++;
//		}

//		int dan = 2;
//		Exit:
//		while(dan<=9) {
//			int count = 1;
//			while(count<=9) {
//				System.out.printf("%d X %d = %d\n",dan,count,dan*count);
//				// :Exit 이용 모든 반복문 벗어나기
//				if(dan==7 && count ==7) {
//					break Exit;
//				}
//				count++;
//				
//			}
//			dan++;
//		}
		
		// continue
		
		// 1부터 10까지의 수중의 3의 배수를 제외한 합 출력
		int n = 1;
		int sum = 0;
		while(n<=10) {
			if(n%3==0) {
				n++;
				continue;
			}
			sum+=n;
			n++;
		}
		System.out.println("Sum : " + sum);
	}
}
