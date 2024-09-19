package C08;

import java.util.Scanner;

public class C08WHILE_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		// 2단 - 9단 출력
//		int dan = 2;
//		while(dan<=9) {
//			int i =1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			dan++;
//		}
		
		// 9단 - 2단( 9x9 9x8... 2x1)
//		int dan = 9;
//		while (dan>=2) {
//			int i=9;
//			while(i>=1) {
//				System.out.printf("%d x %d = : %d\n",dan,i,dan*i);
//				i--;
//			}
//			dan--;
//		}
		
		// 2단 - N단( N <9 )
//		int dan = 2;
//		int N = sc.nextInt();
//		while(N>=9) {
//			System.out.println("다시 입력하세요.");
//			N = sc.nextInt();
//		}
//		while(dan<=N) {
//			int i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			
//			dan++;
//		}
		
		// N단 - M단(N<M, N<9, M<9)
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		
//		while(N==M || N>=9 || M>=9) {
//			System.out.println("다시 입력하세요.");
//			N = sc.nextInt();
//			M = sc.nextInt();
//		}
//		if(N>M) {
//			int temp = N;
//			N = M;
//			M = temp;
//		}
//		while(N<=M) {
//			int i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",N,i,N*i);
//				i++;
//			}
//			
//			N++;
//		}
		
		// 별찍기 (기본높이:4)
		// (1)
//		int i = 1;
//		while(i<=4) {
//			int star = 1;
//			while(star<=i) {
//				System.out.print("*");
//				star++;
//			}
//			i++;
//			System.out.println();
//		}
		
		// (2)
//		int i = 4;
//		while(i>=1) {
//			int star = 1;
//			while(star<=i) {
//				System.out.print("*");
//				star++;
//			}
//			i--;
//			System.out.println();
//		}
		
		// 별찍기 (기본높이:h)
		// (3)
//		int h = sc.nextInt(); // 높이에 따른 별의 최대개수는 2*h-1
//		int i = 1;
//		while(i<=h) {
//			int count = 1;
//			while(count<=h-i) {
//				System.out.print(" ");
//				count++;
//			}
//			count = 1;
//			while(count <= (2*i)-1) {
//				System.out.print("*");
//				count++;
//			}
//			 count = 1;
//			while(count<=h-i) {
//				System.out.print(" ");
//				count++;
//			}
//			i++;
//			System.out.println();
//		}
		
		// (4) 다이아
//		int h = sc.nextInt();
//		int half;
//		int tmp;
//		if(h%2==0) {
//			half = h/2;
//			tmp = -1;
//		} else {
//			half = h/2+1;
//			tmp =0;
//		}
//		
//
//		int i = 1;
//		int j = h-i+1;;
//
//		while(i<=h) {
//			if(i<=half) {
//				int count = 1;
//				while(count<=half-i) {
//					System.out.print(" ");
//					count++;
//				}
//				count = 1;
//				while(count <= (2*i)-1) {
//					System.out.print("*");
//					count++;
//				}
//				count = 1;
//				while(count<=half-i) {
//					System.out.print(" ");
//					count++;
//				}
//			} else {
//				int count = 1;
//				while(count<=i-half+tmp) {
//					System.out.print(" ");
//					count++;
//				}
//				count = 1;
//				while(count <= (2*j)+1) {
//					System.out.print("*");
//					count++;
//				}
//				count = 1;
//				while(count<=i-half) {
//					System.out.print(" ");
//					count++;
//				}
//			}
//			System.out.println();
//			i++;
//			j = h-i;
//		}
		
		// (5)
		int h = sc.nextInt();
		int i=1;
		int half;
		if(h%2==0) {
			half = h/2;
		} else {
			half = h/2+1;
		}
		
		while(i<=h) {
			if(i<=half) {
				int j=1;
				while(j<=half-i) {
					System.out.print(" ");
					j++;
				}
				int k=1;
				while(k<=2*i-1) {
					System.out.print("*");
					k++;
				}
				
			} else {
				int j=1;
				while(j<=i-half) {
					System.out.print(" ");
					j++;
				}
				
				int k=1;
				while(k <= 2*(h-i)+1 ) {
					System.out.print("*");
					k++;
				}
			}
			
			System.out.println();
			i++;
		}
		
	
	}
		
}
