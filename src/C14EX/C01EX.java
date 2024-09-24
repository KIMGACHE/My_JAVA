package C14EX;


//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.

//출력 결과
//32인치 1024컬러
class TV{
	int inch;
	
	TV(){
		this.inch = 0;
	}
	TV(int inch) {
		this.inch = inch;
	}
}
class ColorTV extends TV{
	int color;
	
	ColorTV() {
		super();
		this.color = 0;
	}
	ColorTV(int inch) {
		super(inch);
	}
	ColorTV(int inch, int color) {
		super(inch);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.print(this.inch+"인치, "+this.color+"컬러");
	}
}
public class C01EX {
	
	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty(); // 32인치 1024컬러 가 나오면 해결!
	}
	
}