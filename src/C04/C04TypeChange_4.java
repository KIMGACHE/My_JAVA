package C04;

public class C04TypeChange_4 {

	public static void main(String[] args) {
		// 정수 연산식(int 보다 작은 변수자료형(short, char, byte))
		//
		byte x = 10;
		byte y = 20;
		short z = 30;
		char u = 40;
		byte result1 = (byte)(x+y); 
		// int보다 작은 변수자료형이 연산을 하면 int로 처리하여 계산을 하기때문에 강제 형변환이 없으면 에러가 발생한다. 
		
//		int result1 = x + y;
		System.out.println(result1);

		//정수 연산식(int보다 큰 변수자료형(long))
		byte var1 = 10;
		int var2 = 100;
		long var3 = 1000L;
		long result = var1 + var2 + var3; // int보다 큰 자료형이 있으면 연산의 결과가 큰 자료형으로 바뀐다.
		
		long result2 = var1+ var2 + var3;
		System.out.println(result2);
		
		// 실수 연산식
		// 큰 타입으로 자동 형변환
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		int result3 = (int)(intvar + flvar + dbvar); // 큰 타입으로 자동 형 변환
		double result4 = (int)intvar + (int)flvar + (int)dbvar;
		System.out.println(result3);
	}

}
