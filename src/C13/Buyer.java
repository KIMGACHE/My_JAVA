package C13;

public class Buyer {
	private int myMoney;
	private int appCount;
	
	Buyer(int money, int count) {
		super();
		this.myMoney = money;
		this.appCount = count;
	}
	public void payment(Seller seller, int money) {
		this.myMoney -= money;
		int receiveApp = seller.recieve(money);
		this.appCount += receiveApp;
	}
	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appCount=" + appCount + "]";
	}
}
