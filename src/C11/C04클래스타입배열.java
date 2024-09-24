package C11;

class C04Person {
	String name;
	int age;
	C04Person() {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "C04Person [ name=" + name + ", age=" + age + "]";
	}
}

public class C04클래스타입배열 {
	public static void main(String[] args) {
//		C04Person list[] = new C04Person[3];
//		list[0].name = "홍길동";
//		list[0].age = 55;
//		
//		list[1].name = "김영희";
//		list[1].age = 35;
//		
//		list[2].name = "김범수";
//		list[2].age = 40;
//		
//		for(C04Person obj : list) {
//			System.out.println(obj);
//		}
		
		// 왜 에러가 날까? list의 각 배열에는 객체가 아니라 객체의 시작위치를 담을 공간이 존재하기 때문이다. 객체 자체는 생성자를 통해 생성하지 않았으므로 Null이 기본값이다.
		// 그래서 list[0]에 새로운 객체를 생성해야 접근할 수 있다?
		
		C04Person list[] = new C04Person[3];
		list[0] = new C04Person();
		list[0].name = "홍길동";
		list[0].age = 55;
		
		list[1] = new C04Person();
		list[1].name = "김영희";
		list[1].age = 35;
		
		list[2] = new C04Person();
		list[2].name = "김범수";
		list[2].age = 40;
		
		for(C04Person obj : list) {
			System.out.println(obj);
		}
	}
}
