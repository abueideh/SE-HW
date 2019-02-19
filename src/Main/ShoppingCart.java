package Main;

public class ShoppingCart {
	
	private int count;
	private int price;
	
	public ShoppingCart() {
		count = 0;
	}
	
	public int getCount() {
		return count;
	}

	public void add(Product book) {
		count++;
		price = book.getPrice();
		
	}

	public int getTotalPrice() {
		
		return price;
	}

}
