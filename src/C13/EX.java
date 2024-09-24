package C13;

class Person {
	private int money;
	private int count;
	
	public Person(int money, int count) {
		super();
		this.money = money;
		this.count = count;
	}
	
	public void payment(Store store, int money) {
		this.money -= money;
		int returnCoke = store.sell(money);
		this.count += returnCoke;
	}

	@Override
	public String toString() {
		return "Person [money=" + money + ", count=" + count + "]";
	}
	
}

class Store {
	private int money;
	private int count;
	private int price;
	
	public Store(int money, int count, int price) {
		super();
		this.money = money;
		this.count = count;
		this.price = price;
	}
	
	public int sell(int money) {
		this.money += money;
		int coke = money / price;
		this.count -= coke;
		
		return coke;
	}

	@Override
	public String toString() {
		return "Store [money=" + money + ", count=" + count + ", price=" + price + "]";
	}
	
}

public class EX {

	public static void main(String[] args) {
		// 홍길동이 GS감삼편의점에서 콜라1개를 구매한다.
		// 남길동이 GS감삼편의점에서 콜라3개를 구매한다.
		// 서길동이 GS동성로편의점에서 콜라10개를 구매한다.
		Person 홍길동 = new Person(1000,0);
		Person 남길동 = new Person(10000,0);
		Person 서길동 = new Person(30000,0);
		Store 감삼편의점 = new Store(100000,200,1000);
		Store 동성로편의점 = new Store(300000,200,2000);
		
		홍길동.payment(감삼편의점,1000);
		남길동.payment(감삼편의점,3000);
		서길동.payment(동성로편의점,20000);
		
		System.out.println(홍길동);
		System.out.println(남길동);
		System.out.println(서길동);
		System.out.println(감삼편의점);
		System.out.println(동성로편의점);
	}

}
