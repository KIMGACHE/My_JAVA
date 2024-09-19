package C04;

public class C04StringTypeChange {
	public static void main(String[] args) {
		// 문자열 + 문자열
		System.out.println("문자열1" + "문자열2");
		System.out.println("문자열1" + "문자열2"); // 문자열 + 문자열
		System.out.println("문자열1" + ',' + "문자열2"); // 문자열 + 문자(자동으로 문자열로 형변환 된다) + 문자열
		System.out.println("문자열1" + 2); // 문자열 + 숫자 -> 숫자를 문자로 자동으로 형변환
		System.out.println("문자열" + ',' + '!'); // 문자열 + 문자(숫자) + 문자(숫자) -> 문자열을 먼저 만났으므로 이후 문자도 문자열로 취급한다.
		System.out.println(','+ '!' + "문자열"); // 문자(숫자) + 문자(숫자) + 문자열 -> 문자와 문자가 먼저 더해졌으므로 숫자가 된다.
		System.out.println("문자열1" + "문자열2");
		
		// 문자열 -> 숫자형
		
		//문자열 -> 숫자형 (정수)
		System.out.println("10"+"20"); // 문자열 연결
		
		int n1 = Integer.parseInt("10");
		int n2 = Integer.parseInt("20");
		System.out.println(n1+n2);
		
		//문자열 -> 숫자형 (실수)
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.4");
		System.out.println(n3+n4);
		
		short n5 = Short.parseShort("5");
		short n6 = Short.parseShort("6");
		System.out.println(n5+n6);
		
		// 숫자형 -> 문자형
		int value1 = 10;
		double value2 = 3.14;
		
		System.out.println(value1 + value2); // 연산
		
//		String str1 = String.valueOf(value1);
//		String str2 = String.valueOf(value2);
		String str1 = value1+"";
		String str2 = value2+"";
		
		System.out.println(str1+str2); // 문자열 붙이기
	}
}
