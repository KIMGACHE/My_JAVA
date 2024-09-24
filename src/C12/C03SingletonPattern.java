package C12;

class Company {
	int n1;
	int n2;
	
	private static Company instance; // instance라는 멤버변수, static
	private Company() {} // 외부에서 Company 객체를 생성하지 못하게 막는다.
	public static Company getInstance() {
		if(instance==null)
			instance = new Company(); // 객체를 아무도 만들지 않았을 때 객체생성
		return instance; // 객체가 이미 존재한다면 존재하는 객체 리턴
	}
	// toString() 재정의
	@Override
	public String toString() {
		return "Company [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
}

public class C03SingletonPattern {

	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		com1.n1 = 100; com2.n2=200;
		System.out.println("com1 : " + com1);
		System.out.println("com2 : " + com2);
	}

}
