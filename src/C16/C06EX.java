package C16;
import java.util.Scanner;

abstract class Converter {
   abstract protected double convert(double src); // 추상 메소드
   abstract protected String getSrcString(); // 추상 메소드
   abstract protected String getDestString(); // 추상 메소드
   protected double ratio; // 비율
   public void run() {
      Scanner scanner = new Scanner(System.in);
      System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
      System.out.print(getSrcString()+"을 입력하세요>> ");
      double val = scanner.nextDouble();
      double res = convert(val);
      System.out.println("변환 결과: "+res+getDestString()+"입니다");
      scanner.close();
   }
}

class Won2Dollar extends Converter {
	Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {return "원";}
	protected String getDestString() {return "달러";}
}

class Km2Mile extends Converter {
	Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return (double)(src/ratio);
	}
	protected String getSrcString() {return "km";}
	protected String getDestString() {return "mile";}
}

public class C06EX {
	public static void main(String args[]) {
	   Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
	   toDollar.run();
	   
	   Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
	   toMile.run();
	}
}
//원을 달러로 바꿉니다.
//원을 입력하세요>> 24000
//변환 결과: 20.0달러입니다

//	Km을 mile로 바꿉니다.
//	Km을 입력하세요>> 30
//	변환 결과: 18.75mile입니다