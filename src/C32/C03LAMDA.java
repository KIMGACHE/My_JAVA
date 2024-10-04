package C32;

// 덧셈, 뺄셈, 곱셈, 나눗셈을 수행하는 함수형 인터페이스 정의
interface Calculator {
	int calculator(int num1, int num2);
	
}

public class C03LAMDA {

	public static void main(String[] args) {
		
		Calculator add = (num1,num2)->{return num1+num2;};
		Calculator sub = (num1,num2)->num1-num2;
		Calculator mul = (num1,num2)->{return num1*num2;};
		Calculator div = (num1,num2)->{return num1/num2;};
		
		int a = 10;
		int b = 2;
		int sum = add.calculator(a, b);
		System.out.println(sum);

	}

}
