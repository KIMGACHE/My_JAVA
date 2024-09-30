package C19;

class 맛 {}

class 캬라멜 extends 맛 {

	@Override
	public String toString() {
		return "캬라멜";
	}
	
}
class 버터옥수수 extends 맛 {

	@Override
	public String toString() {
		return "버터옥수수";
	}
	
}

class PopCorn<T extends 맛> {
	private T flavor;
	PopCorn(T flavor) {
		this.flavor = flavor;
	}
	@Override
	public String toString() {
		return flavor + "맛 팝콘";
	}
	
}

public class C02GenericMain {
	public static void main(String[] args) {
		PopCorn<캬라멜> ob1 = new PopCorn<캬라멜>(new 캬라멜());
		System.out.println(ob1);	//캬라멜맛 팝콘이 출력
		
		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);	//버터옥수수맛 팝콘이 출력
	}
}
