package C09;
// 단일 클래스내에 public클래스가 여러개 존재 할 수 없다.
// 같은 package내에 같은 클래스명을 가진 클래스가 존재 할 수 없다.
class C09Person3 {
	// 속성
	String name;
	int age;
	float height;
	double weight;
	// 기능
	// 말하다
	void talk() {
		System.out.println(this.name + "이 말합니다."); // this : 객체가 만들어진다면 해당 객체를 의미한다.
	}
	// 걷다
	void walk() {
		System.out.println(this.name + "이 걷습니다.");
	}
	// 정보확인
	@Override
	public String toString() {
		return "C09Person3 [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
}

public class C09PersonMain2 {
	public static void main(String[] args) {
		C09Person3 hong = new C09Person3();
		hong.name = "홍길동";
		hong.age = 44;
		hong.height = 177.5f;
		hong.weight = 70.5;
		hong.walk();
		hong.talk();
//		System.out.printf("%s %d %f %f\n", hong.name,hong.age,hong.height,hong.weight);
		System.out.println(hong);
	}
}
