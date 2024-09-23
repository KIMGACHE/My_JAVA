package C10;

// 정보은닉과 캡슐화는 다른 개념이다.

class C01Person {
	private String name;
	private int age;
	private String addr;
	
	// Constructor 자동으로 만들기 -> 우클릭 -> Source -> Generate Constructor using~~
	public C01Person(String name, int age, String addr) {
			super();
			this.name = name;
			this.age = age;
			this.addr = addr;
	}
	
//	 C10Person(String name, int age, String addr) {
//		 this.name = name;
//		 this.age = age;
//		 this.addr = addr;
//	 }
	
	 // getter and setter 함수
//	 public String getName() {
//		 return this.name;
//	 }
//	 public int getAge() {
//		 return this.age;
//	 }
//	 public String getAddr() {
//		 return this.addr;
//	 }
//	 public void setName(String name) {
//		 this.name = name;
//	 }
//	 public void setAge(int age) {
//		 this.age = age;
//	 }
//	 public void setAddr(String addr) {
//		 this.addr = addr;
//	 }

	// 자동으로 getter, setter만들기 -> 우클릭 -> Source -> Generate Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	 
}

public class C01정보은닉 {
	public static void main(String[] args) {
		// 정보은닉 : 정보를 숨기는 것
		// 왜 할까? 민감한 데이터에 접근할 수 없도록 하기 위해
		// 접근 한정자
		// 멤버 변수 or 멤버 메서드 or 클래스에 부여되어 접근을 제한한다.
		// public : 모든 클래스에서 접근이 가능하다.
		// protected : 동일 패키지에 속한 클래스 및 서브 클래스에서 접근이 가능하다.
		// default : 동일 패키지에 속한 클래스에서만 접근을 허용한다. 기본값으로 한정자를 쓰지 않는 경우이다.
		// private : 현재 클래스에서만 접근이 가능하다.
		C01Person hong = new C01Person("홍길동",50,"대구");
		// hong.age 를 확인할 수 없다.
		// hong.addr 을 확인할 수 없다. 둘 다 private으로 바꿨기 때문.
		int age = hong.getAge();
		hong.setAddr("울산");
	}
}
