package C12;

class C02Simple{
	int n1; // n1은 객체가 생성될 때 만들어진다. 객체 내에 개별 공간이 있다.
	static int n2; // 객체가 생성되기 전부터 만들어진다.
	
	void func1() { // 객체가 생성될 때 만들어지므로 func1이 n2이 접근하는 것은 문제가 없다.
		n1=10;
		n2=20;
	}
	static void func2() { // 객체가 생성되기 전부터 만들어진다.
		n2=10; // n2또한 객체 생성이전에 만들어지므로 접근가능하다.
		// n1=20; // 그러나 func2가 생성되는 시점에 n1은 생성되지 않았으므로 에러가 발생한다.
	}
}

public class C02StaticMain {
	public static void main(String[] args) {
		
	}
}
