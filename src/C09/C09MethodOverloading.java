package C09;

class C09Simple2 {
	int sum(int x, int y) {
		System.out.println("int sum(int x , int y)");
		return x+y;
	}
	int sum(int x, int y, int z) {
		System.out.println("int sum(int x , int y, int z)");
		return x+y+z;
	}
	int sum(double x, double y, double z) {
		System.out.println("int sum(double x , double y, double z)");
		return (int)(x+y+z);
	}
}

public class C09MethodOverloading {
	// 메서드 이름은 동일하지만 파라미터가 다른 여러 메서드를 만드는 것을 말한다.
	// 조건
	// 1. 메서드 이름이 같아야 한다.
	// 2. 파라미터의 개수 또는 자료형이 달라져야 한다.
	// 3. 파라미터는 같고 리턴 변수의 자료형이 달라지면 안된다.
	public static void main(String[] args) {
		C09Simple2 obj = new C09Simple2();
		obj.sum(10,20);
		obj.sum(10, 20, 30);
		obj.sum(10.5, 20.5, 30.5);
		C09Simple2 obj2 = new C09Simple2();
	}

}
