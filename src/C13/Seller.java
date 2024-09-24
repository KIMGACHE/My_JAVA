package C13;

public class Seller {
	private int myMoney;
	private int appCount;
	private int price;
	
	public Seller(int myMoney, int appCount, int price) {
		super();
		this.myMoney = myMoney;
		this.appCount = appCount;
		this.price = price;
	}

	public int recieve(int money) {
		this.myMoney += money;
		int returnCount = money / price;
		this.appCount -= returnCount;
		
		return returnCount;
	}

	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appCount=" + appCount + ", price=" + price + "]";
	}
	
}
