package C32;

interface Printer {
//	void print(String message);
	String print(String message);
//	String print();
}

public class C02LAMDA {
	public static void main(String[] args) {
		//01 (람다식은 함수형 인터페이스의 미완성된 메서드를 완성시켜 사용할 수 있다?)
//		Printer printer = (message)->{System.out.println(message);};
//		printer.print("HelloWorld");
		
		//02
//		Printer printer = (message)->{
//			return message;
//		};
//		String msg = printer.print("TEST");
//		System.out.println(msg);
		
		Printer printer = (message)->message+"!!!"; // line이 한줄을 넘기지 않으면 {}를 벗기고 return을 생략할 수 있다.
		String msg = printer.print("Test");
		System.out.println(msg);
		
		//03
	}
}
