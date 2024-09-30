package C18;

public class C01NullPointerExceptionMain {

	public static void main(String[] args) {
		// 오류의 종료
		// 1. 컴파일 에러(compile error) - 컴파일할 때 발생하는 에러
		// 2. 실행 오류 (runtime error) - 실행할 때 발생하는 에러,가장 치명적
		// 2-1 시스템오류
		// 2-2 예외 - 프로그램이 실행되는 동안에 발생하는 예기치 않은 에러
		// 3. 내가 원하는대로 작동하지 않는 경우, bug

		// 예외처리
		// try-catch
		
		String str=null;
		try {
			System.out.println(str.toString()); // Exception -> 예외가 발생하여 예외객체가 만들어졌다고 알려주는 텍스트
		} catch(NullPointerException e) { // try에 있는 코드에 의해 생성된 예외 객체를 받는다
//			System.out.println("예외객체 확인 : "+ e);
//			System.out.println(e.getCause());
//			System.out.println(e.toString());
//			System.out.println(e.getStackTrace());
			e.printStackTrace();
			
		}
		System.out.println("HELLOWORLD");
	}

}
