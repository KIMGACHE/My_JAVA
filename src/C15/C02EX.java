package C15;

abstract class Employee {
	public String name;
	private int age;
	private String addr;
	
	public Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	// 추상메서드
	abstract int payment();
	
	public void setAge(int age) { this.age = age;}
	public void setAddr(String addr) { this.addr = addr;}
	public int getAge() { return this.age;}
	public String getAddr() { return this.addr;}
}

class Parttimer extends Employee {
	private int hour_pay;
	private int time;

	@Override
	int payment() {
		return hour_pay * time;
	}
	
	public Parttimer(String name, int age, String addr, int hour_pay) {
		super(name, age, addr);
		this.hour_pay = hour_pay;
	}
	 
	public void setHourPay(int pay) {this.hour_pay = pay;}

	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + ", name=" + name + "]";
	}


}

class Regular extends Employee {
	private int salary;

	@Override
	int payment() {
		return salary/12;
	}
	
	public Regular(String name, int age, String addr, int salary) {
		super(name, age, addr);
		this.salary = salary;
	}
	
	public void setSalary(int salary) {this.salary = salary;}
	
	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + "]";
	}
	 
	 
}
public class C02EX {
	public static void main(String[] args) {
		Parttimer one = new Parttimer("김기현",28,"대구", 20000);
		Regular two = new Regular("진찬민",27,"포항", 2000000);
		
		System.out.println(one);
		System.out.println(two.getAddr());
	}
}
