package C11;

import java.util.Scanner;

public class C06EX {
	public static void main(String[] args) {
		// 5명의 학생의 국영수 점수를 입력받아 2차원 배열에 저장
		// 각 학생의 국영수 점수의 합/평균을 구하고
		// 각 과목당 합/평균을 구해보라.
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][3];
		for(int i=0; i<5; i++ ) {
			for(int j=0;j<3; j++) {
				System.out.println("학생의 국/영/수 점수를 입력하시오.");
				score[i][j] = sc.nextInt();
			}
		}
		
		int sumK = 0;
		int sumE = 0;
		int sumM = 0;
		
		for(int i=0; i<5; i++ ) {
			int sum = 0;
			for(int j=0;j<3; j++) {
				sum += score[i][j];
				if(j==0) sumK += score[i][j];
				if(j==1) sumE += score[i][j];
				if(j==2) sumM += score[i][j];
			}
			System.out.printf("%d번째 학생의 국영수 점수의 합 : %d, 평균 : %d\n",i,sum,sum/3);
		}
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n",sumK,sumE,sumM);
	}
}
