package C09;

// 변수 종류

// 멤버 변수 : 클래스 내의 멤버로 사용되는 변수( 속성 저장 )
// 지역 변수 : {}내에서 선언되는 변수, {}를 벗어난다면 공간 반환, 변수명 중복시 좁은 지역의 변수가 적용
// 전역 변수 : static 변수

class C09Simple{
	int num = 5;	//  멤버 변수
	void Func1() {
		System.out.println(num);	// 멤버변수 num
		int num = 10; // Func1 지역의 num
		System.out.println(num);	// 지역변수 num
	}
	void Func2() {
		System.out.println(num);	// 멤버변수 num
		if(true) {
			int num = 20;
			System.out.println(num);	// 지역변수
		}
		System.out.println(num);	// 멤버변수 num
		
		while(num<10)
		{
			int num = 20; // 지역변수 num
			num++;
		}
	}
	
	void Func3(int num) { // 매개변수 num
		num++; // 매개변수
		this.num++; // 객체의 num
	}
	
	
}

public class C09LocalVarMain {

	public static void main(String[] args) {
		

	}

}
