package C17;

class A {
	int x=10;
	int y=20;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "X=" + x + " Y="+y;
	}
	
}
// 아무것도 없어도 Object와 상속관계에 있다.
public class C01ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob1 = new Object();
		System.out.println(ob1);
		System.out.println(ob1.toString());
		A ob2 = new A();
		System.out.println(ob2);
		System.out.println(ob2.toString());
	}

}
