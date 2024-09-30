package C14;

class Parent {
	
	void func1() {System.out.println("Parent Func1() Call");}
}
class Son extends Parent{
	void func1() {System.out.println("Son Func1 호출");}
	void func2() {System.out.println("Son Func2(extends..) 호출");}
}

public class C06UpDownCastingMain {

	public static void main(String[] args) {		
		// UpCasting을 쓰는 2번째 이유
		Parent ob1 = new Parent();
		ob1.func1();
		
		Son ob2 = new Son();
		ob2.func1();
		
		Parent ob3 = new Son(); // 클래스의 메서드는 공유 메모리 공간에 적재된다.(대신 객체 생성시에 적재됨, static과는 다르다.) 왜? 어차피 로직은 똑같으니까 모든 같은 클래스 자료형의 객체가 공유하면 되기때
		// func1은 overriding되었기때문에 상위클래스자료형의 객체인 ob3도 접근 가능한것
		ob3.func1();
		
		// UpCasting
		// 상위 클래스형 참조변수 = 하위클래스형 객체
		// 자동형변환
		// 상속관계의 모든 클래스로 만든 객체를 연결할 수 있다(중요)
		// UPCASTING상태에서는 확장된 멤버변수 접근이 불가하다 -> DownCasting으로 해결
		// UPCASTING상태에서는 재정의된 함수에 접근이 가능하다

	}

}
