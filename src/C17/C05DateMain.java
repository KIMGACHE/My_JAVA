package C17;

import java.util.Calendar;
import java.util.Date;

public class C05DateMain {
	public static void main(String[] args) {
//		Date d1 = new Date();
//		System.out.println(d1);
//		System.out.println(d1.getYear()+1900); // 1900년도가? 기준이라 +1900을 해주어야 맞아떨어진다. 
//		System.out.println(d1.getMonth()+1); // 1월이면 0이다.
//		System.out.println(d1.getDay()); // 요일정보로 0~6까지로 일~토로 표시된다.
//		System.out.println(d1.getHours());
//		System.out.println(d1.getMinutes());
//		System.out.println(d1.getSeconds());
//		System.out.println(d1.getTime());
		
		Calendar cal = Calendar.getInstance(); // 캘린더는 싱클톤 패턴이다.
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR)); // 년도
		System.out.println(cal.get(Calendar.MONTH)+1); // 월, 마찬가지로 0부터 세기때문에 +1을 해준다.
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 일, 이번달의 몇일인지
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 요일(1-7, 일-토)
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 시간
		System.out.println(cal.get(Calendar.MINUTE)); // 분
		System.out.println(cal.get(Calendar.SECOND)); // 초
		
	}
}
