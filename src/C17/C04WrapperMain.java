package C17;

public class C04WrapperMain {
	public static void main(String[] args) {
		// wrapper 클래스
		// 자바의 기본 자료형(원시타입)을 객체 타입으로 처리할 수 있도록 만든 클래스이다.
		
		//Boxing (기본자료형 -> Wrapper Class)
		Integer ob1 = new Integer(100); // 잘 사용하지않는 방식이라는 의미
		Integer ob2 = new Integer("100");
		Integer ob3 = Integer.valueOf("300");
		System.out.println(ob1+ob2+ ob3);
		
		// UnBoxing
		int n1 = ob1.intValue();
		int n2 = ob1.intValue();
		int n3 = ob1.intValue();
		System.out.println(n1 + n2 + n3);
		
		// Auto Boxing
		Integer ob4 = 100; // 자동으로 Integer형으로 Boxing
		int nn4 = ob1 + ob2 +ob3; // 자동으로 int형으로 Boxing
	}
}
