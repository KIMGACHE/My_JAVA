package C09;

public class C09Main {

	public static void main(String[] args) {
		C09Person hong = new C09Person();
		hong.name = "홍길동";
		hong.age = 44;
		hong.height = 177.5f;
		hong.weight = 70.5;
		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);

	}

}
