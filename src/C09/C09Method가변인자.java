package C09;

class C09Simple3 {
	int sum(int ...args) {
		for(int num : args) {
			System.out.print(num + " ");
		}
		System.out.println();
		return 0;
	}
}

public class C09Method가변인자 {

	public static void main(String[] args) {
		C09Simple3 obj = new C09Simple3();
		obj.sum(10);
		obj.sum(10,20);
		obj.sum(10,20,30);
		obj.sum(10,20,30,40);
		obj.sum(10,20,30,40,50);
		obj.sum(10,20,30,40,50,60);
	}
}
