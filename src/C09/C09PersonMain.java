package C09;
// 단일 클래스내에 public클래스가 여러개 존재 할 수 없다.
// 같은 package내에 같은 클래스명을 가진 클래스가 존재 할 수 없다.
class C09Person2 {
	// 속성
	String name;
	int age;
	float height;
	double weight;
}

public class C09PersonMain {
	public static void main(String[] args) {
		C09Person2 hong = new C09Person2();
		hong.name = "홍길동";
		hong.age = 44;
		hong.height = 177.5f;
		hong.weight = 70.5;
		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);
	}
}
