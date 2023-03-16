package test_0316;

public class FruitSales {

	public static void main(String[] args) {
		FruitSeller fs = new FruitSeller();
		FruitBuyer fb = new FruitBuyer();
		
		fb.buyApple(2000, fs);
		System.out.println("과일 판매자의 현재 상황 : ");
		fs.showSaleResult();
		
		System.out.println("과일 구매자의 현재 상황 : ");
		fb.showSaleResult();
	}

}

class FruitSeller{
	int numOfApple = 20;
	int mymoney = 0;
	int APPLE_PRICE = 1000;
	public FruitSeller() {};
	
	public int saleApple(int n) {
		int num = n/APPLE_PRICE;
		mymoney += num*APPLE_PRICE;
		numOfApple -= num;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("남은 사과 개수는 " + numOfApple + "이고, 수익은 " + mymoney +"입니다.");
	}
	
}

class FruitBuyer{
	int numOfApple = 0;
	int myMoney = 5000;
	public FruitBuyer() {};
	
	public void buyApple(int money, FruitSeller seller ) {
		numOfApple = seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showSaleResult() {
		System.out.println("사과 개수는 " + numOfApple + "이고, 현재 잔액은 " + myMoney +"입니다.");
	}	
}
