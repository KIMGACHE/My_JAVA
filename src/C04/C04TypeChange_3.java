package C04;

public class C04TypeChange_3 {
	public static void main(String[] args) {
		int n1 = 129;
		int n2 = 130;
		byte n3 = (byte)n1;
		byte n4 = (byte)n2;
		
		System.out.printf("%d\n", n3);
		System.out.printf("%d\n", n4);
	}
}
