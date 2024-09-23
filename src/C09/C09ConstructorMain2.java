package C09;

//클래스 선언시 생성자함수를 1개이상 명시하게 되면 디폴트생성자가 자동주입되지 않으니 주의!

class C09Simple5{
	int num;

	C09Simple5(){} // 이 생성자가 없다면 아래의 생성자를 무조건 따라야한다. 생성자가 하나라도 있는 순간 디폴트 생성자가 없어지기때문
	// 위의 생성자가 디폴트 생성자
	public C09Simple5(int num) {
		super();
		this.num = num;
	}
	
//	C09Simple(int num){this.num = num;}	
}
public class C09ConstructorMain2 {

	public static void main(String[] args) {
		
		C09Simple5 ob = new C09Simple5();
	}
}