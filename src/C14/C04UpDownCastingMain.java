package C14;

class Super {
	int n1;
}

class Sub extends Super {
	int n2;
}
// 업캐스트(자동 형변환)
// 부모 클래스형의 참조변수 = 자식 클래스의 객체
// 부모 클래스형의 참조변수를 통해서는 부모 클래스의 속성에만 접근
public class C04UpDownCastingMain {

	public static void main(String[] args) {
		// NoCasting
		Super ob1 = new Super();
		Sub ob2 = new Sub();
		
		// UpCasting(상위 클래스형 참조변수 = 하위 클래스형 객체), 자동형변환
		Super ob3 = new Sub(); // 실제 Sub()객체에는 확장된 변수n2가 실재는 하겠지만 Super 자료형인 ob3는 n2에 접근할 수 없다.
		ob3.n1 = 100;
//		ob3.n2 = 200; // 불가능
		Super ob4 = ob2;
		
		// DownCasting(하위 클래스형 참조변수 = 상위클래스형 객체), 강제형변환, UpCasting을 전제로 사용한다.
		// UpCasting을 전제로 확장된(추가된)멤버에 접근하기 위해 사용
		
//		Sub ob5 = (Sub)new Super(); // 실제 상위 클래스에 강제형변환하는 경우는 의미가없다! 업캐스팅된 실제 하위 클래스에 강제형변환한다.
		Sub down = (Sub)ob3; // ob3의 자료형은 Super지만 실제 객체는 Sub이다.
		down.n1 = 10;
		down.n2 = 20;
	}

}
