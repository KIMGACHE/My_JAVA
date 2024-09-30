package C18;

class A {
	public void Ex1() throws NullPointerException { // 예외의 방향,처리를 직접한다. 실행하는 위치로 예외객체를 던져준다.
		throw new NullPointerException("NULL EXCEPTION"); // 예외를 Ex1이 관리하는게아니라 컴파일러가 예외객체를 발생시키는것? 
	}
}
class B {
	public void Ex2(A a) throws NullPointerException {
//		try {
			a.Ex1(); // throws를 사용하여 예외객체를 던졌기때문에 실행한 위치에서 try-catch로 잡을 수 있다. 만약 throw만 있었다면 객체만 만들어진 해당 코드에서 try-catch를 사용해야한다.
//		} catch() {
//			
//		}
	}
}

public class C05ThrowAndThrowsMain {
	// 예외객체를 생성
	// throw : 3인칭, 던지는 주체가 내가 아님
	// throws : 1인칭, 던지는 주체가 나임
	public static void main(String[] args) {
		System.out.println("실행코드 1");
		System.out.println("실행코드 2");
		A a = new A();
		B b = new B();
		try {
			b.Ex2(a);
		} catch(Exception e) {
			System.out.println("Main에서 예외처리");
		}
		System.out.println("실행코드 3");
	}

}
