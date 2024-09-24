package C10;


class Profile{
	//속성
	private String name;
	private String addr;
	private String job;
	private String major;
	//생성자
	//1)디폴트생성자 삽입
	//2)모든 인자 받는 생성자 삽입 -> 각멤버에 대입
	//3)모든 인자 받는 생성자 삽입(가변인자사용할것) -> , 를기준으로 잘라내어 각속성에 저장
	//ex, "홍길동,대구,프로그래머,컴퓨터공학" ->[홍길동,대구,프로그래머,컴퓨터공학]
	Profile() {
		this.name = "";
		this.addr = "";
		this.job = "";
		this.major = "";
	}
	Profile(String name, String addr, String job, String major){
		this.name = name;
		this.addr = addr;
		this.job = job;
		this.major = major;
	}
	Profile(String ...strings){
		for( String str : strings) {
			String[] strArr = str.split(",");
			this.name = strArr[0];
			this.addr = strArr[1];
			this.job = strArr[2];
			this.major = strArr[3];
		}
	}
	
	//기능
	//1) 속성은 private으로 설정, getter and setter 삽입
	public String getName() {return this.name;}
	public String getAddr() {return this.addr;}
	public String getJob() {return this.job;}
	public String getMajor() {return this.major;}
	
	public void setName(String name) {this.name = name;}
	public void setAddr(String addr) {this.addr = addr;}
	public void setJob(String job) {this.job = job;}
	public void setMajor(String major) {this.major = major;}
	
	//2) toString  재정의 
	public String toString() {
		return "이름 : " + this.name + ", 주소 : " + this.addr + ", 직업 : " + this.job + ", 전공 : " + this.major;
	}
	
	//3) boolean isContain(String findstr) 함수 완성하기
	boolean isContain(String findstr) {
		//findstr의 문자열이 각멤버인 name,addr,job,major 중 하나라도 포함되어 있으면 true 리턴
		//아니면 false 리턴
		if(this.name.contains(findstr) || this.addr.contains(findstr) || this.job.contains(findstr) || this.major.contains(findstr)) return true;
		else return false;
	}
	//4)
	boolean isEquals(String str) {
		//all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
		//name,addr,job,major 와 일치 하면 true
		//아니면 false 를 리턴
		String[] strArr = str.split(",");
		if(strArr[0].equals(this.name) && strArr[1].equals(this.addr) && strArr[2].equals(this.job) && strArr[3].equals(this.major) ) return true;
		else return false;
	}


	
}


public class C07EX {

	public static void main(String[] args) {
		Profile hong = new Profile("홍길동,대구,프로그래머,컴퓨터공학");
		System.out.println(hong.toString());
		System.out.println("길동 포함여부 : " + hong.isContain("길동"));	//true
		System.out.println("컴퓨터 포함여부 : " + hong.isContain("컴퓨터"));	//true
		System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,대구,프로그래머,컴퓨터공학")); //true
		System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,울산,프로그래머,컴퓨터공학")); //false
	} 
}