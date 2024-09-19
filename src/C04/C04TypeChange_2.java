package C04;

public class C04TypeChange_2 {
	public static void main(String[] args) {
		// 강제형변환
		// 좁은범위의 공간에 큰 범위안의 값을 넣으려고 하는 경우
		// 데이터 손실 우려가 있기때문에 컴파일 수준에서 에러를 확인할 수 있다.
		// 이때 해당 오류를 무시하고 강제로 변환하는 작업을 강제 형변환이라고 한다.
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println((int)charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		//데이터 손실!
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		char a = 1010;
		short b = (short)a;
	}
}
