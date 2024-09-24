package C11;

public class C05MainArgsArray {
	public static void main(String[] args) { // args 외부로부터 값을 받아올 수 있다.
		System.out.println("길이 : " + args.length);
		
		for(String param : args)
			System.out.println(param);
		// C11 우클릭 후 Show in Local Terminal -> Terminal -> javac C05MainArgsArray.java -> dir을 해보면 .class파일이 생성됨 -> cd .. -> java C11.C05MainArgsArray [대괄호없이 넣을 인자값]
	}
}
