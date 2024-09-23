package C10;



public class C05StringClassMain {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		// 데이터의 값이 같다면 상수 pool에서 새로운 값을 만들지 않는다.
		// 따라서 str1, str2는 stack에 같은 메모리 위치 정보를 저장하고 있다.
		String str3 = new String("java");
		// heap에 java라고하는 객체를 생성? str3에 해당 주소를 stack에서 저장한다.
		String str4 = new String("java");
		// heap에 java라는 객체를 생성? str4에 해당 주소를 stack에서 저장한다.
		
		System.out.println("str1==str2 ? " + (str1==str2));
		System.out.println("str3==str4 ? " + (str3==str4));
		System.out.println("str1==str3 ? " + (str1==str3));
		System.out.println("str2==str4 ? " + (str2==str4));
		System.out.println("============================");
		System.out.println("str1==str2 ? " + (str1.equals(str2)));
		System.out.println("str3==str4 ? " + (str3.equals(str4)));
		System.out.println("str1==str3 ? " + (str1.equals(str3)));
		System.out.println("str2==str4 ? " + (str2.equals(str4)));
	}

}