package C04;

public class C04TypeChange_5 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 4;
		
//		double dnum1 = num1/num2;	-> 2.0
		double dnum1 = (double)num1/num2;	// 10.0나누기 4 -> 2.5 
//		double dnum2 = num1/num2;	-> 2.0
		double dnum2 = (num1*1.0)/num2;
//		double dnum3 = num1/num2;
		double dnum3 = (1.0*num1)/num2;
		System.out.println("dnum1 : "+dnum1);
		System.out.println("dnum2 : "+dnum2);
		System.out.println("dnum3 : "+dnum3);
	}
}
