package C12;

class C01Simple {
	static int num1;	// 공유 메모리 영역 (클래스, 메서드 영역)에 할당, 객체 생성과는 무관하게 사용 가능하다.(클래스명.static변수명으로 접근가능하다-private가 아닌 한)
	int num2;			// heap 영역에 할당
	
	C01Simple() {
		this.num1 = 0;
		this.num2 = 0;
	}

	@Override
	public String toString() {
		return "C01Simple [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
}

public class C01StaticMain {
	// static: 클래스 메서드와 클래스 변수를 선언하는 데 사용한다.
	// static은 자바의 정적 영역에 할당되는 리소스를 선언하는데 사용하며 동일 가상머신상에서 실행 중인 모든 클래스에서 공유한다.
	// 인스턴스(객체)를 생성하지 않고도 클래스의 메서드나 멤버에 접근할 수 있다.

	public static void main(String[] args) {
		C01Simple ob1 = new C01Simple();
		C01Simple ob2 = new C01Simple();
//		C01Simple.num1 = 100;
		ob1.num1=123;
		System.out.println("num1 : " + C01Simple.num1);
		System.out.println("ob1's num1 : " + ob1.num1);
		System.out.println("ob2's num1 : " + ob2.num1);
		
	}
	// Stack영역	| heap영역 | Class(Method)영역
	// ob1에는 객체의 시작위치를 저장함 | C01Simple객체 | num1위치
	// ob2에는 객체의 시작위치를 저장함 | C01Simple객체 | num1위치
}
