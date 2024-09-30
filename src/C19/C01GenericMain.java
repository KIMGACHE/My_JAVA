package C19;

class 호빵<T extends 재료> {
	private T material;
	호빵(T material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "호빵 [material=" + material + "]";
	}
	
}
class 재료 {}

class 야채 extends 재료 {

	@Override
	public String toString() {
		return "야채";
	}
}
class 팥 extends 재료{
	@Override
	public String toString() {
		return "팥";
	}
}
class 슈크림 extends 재료{
	@Override
	public String toString() {
		return "슈크림";
	}
}
class 피자 extends 재료{
	@Override
	public String toString() {
		return "피자";
	}
}
class 민초{
	@Override
	public String toString() {
		return "민초";
	}
}


public class C01GenericMain {

	public static void main(String[] args) {
		// 자료형을 객체가 생성되는 시점에 정하는 문법
		// 클래스 내부에서 사용할데이터 타입을 외부에서 지정하는 기법
		호빵<팥> ob1 = new 호빵<팥>(new 팥());
		System.out.println(ob1);
		호빵<야채> ob2 = new 호빵<야채>(new 야채());
		System.out.println(ob2);
		호빵<슈크림> ob3 = new 호빵<슈크림>(new 슈크림());
		System.out.println(ob3);
		호빵<피자> ob4 = new 호빵<피자>(new 피자());
		System.out.println(ob4);
		// Generic타입으로 사용할 자료형을 제한하고 싶다면 사용할 자료형에 상위클래스를 만들어 상속시킨다.
		// <T extends 재료> generic 타입이 재료클래스와 상속관계에 있는 클래스만 받게끔 한다.
//		호빵<민초> ob5 = new 호빵<민초>(new 민초());
//		System.out.println(ob5);
	}

}
