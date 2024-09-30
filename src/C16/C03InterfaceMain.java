package C16;

interface A {}
interface B {}

class C{}
// interface는 다중 상속 가능
class D implements A,B{}
// extends 다중 상속 불가 C,D이런식 안됨
class E extends C{}

// 순서상 extends를 먼저 쓰고 implements를 사용해야 한다.
public class C03InterfaceMain {

	public static void main(String[] args) {
		

	}

}
