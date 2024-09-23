package C10;

class C04Simple {
	int x;
	int y;
	C04Simple() {
//		this.x = 0;
//		this.y = 0;
		this(0,0);
	}
	C04Simple(int x) {
//		this.x = x;
//		this.y = 0;
		this(x,0);
	}
	C04Simple(int x, int y) {
		System.out.println("C04Simple(int x, int y) 생성자 호출!");
		this.x = x;
		this.y = y;
	}
	C04Simple getThis() {
		return this;
		// this는 만들어진 객체의 위치정보를 리턴한다.
	}
}

public class C04ThisMain {
	// 그래서 this로 뭐 할 수 있음?
	// 1. 멤버변수, 매개변수를 구별하는데 사용 
	// 2. 다른 생성자를 호출하는데 사용
	public static void main(String[] args) {
		C04Simple ob = new C04Simple();
		System.out.println(ob);
		System.out.println(ob.getThis());
	}
}
