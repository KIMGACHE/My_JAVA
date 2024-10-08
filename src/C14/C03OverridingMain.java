package C14;

// 매서드 오버라이딩(함수 재정의)
// 상속관계를 전제로 상위클래스의 매서드를 하위클래스가 재정의(고쳐서 사용)하는 것을 허용한 문법
// 매서드의 헤더부분은 동일하게 두고 본체({})의 로직을 다양하게 둠으로써(다형성) 같은 함수를 상위클래스로부터 물려받더라도 각 하위클래스마다 다양한 형태의 결과물을 만들어 낼 수 있다.

// 오버로딩 vs 오버라이딩
// 오버로딩 : 헤더를 건드린다, 개발자의 편의성에 중점(함수 이름 단일화), 상속을 전제로 하지않는다.
// 오버라이딩 : 본체를 건드린다, 다형성, 상속을 전제로 한다.

class Animal {
	void sound() {System.out.println("소리낸다.");}
}
class Dog extends Animal{ // 헤더 부분을 건드리면 오버라이딩이 아니다! 본체 부분만 건드리자.
	void sound() {System.out.println("멍멍 소리낸다.");}
}
class Cat extends Animal{
	void sound() {System.out.println("야옹 소리낸다.");}
}

public class C03OverridingMain {
	public static void main(String[] args) {
		Animal ani = new Animal();
		Dog poppi = new Dog();
		Cat yammi = new Cat();
		ani.sound();
		poppi.sound();
		yammi.sound();
		
		System.out.println("--------------------------");
		// Upcasting..
		ani = poppi;
		ani.sound();
		ani = yammi;
		ani.sound();
	}
}
