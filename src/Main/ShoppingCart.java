package Main;

import java.util.ArrayList;

public class ShoppingCart {
	
	private int count;
	private int price;
	ArrayList <Product> cart;
	
	public ShoppingCart() {
		count = 0;
		cart = new ArrayList <Product> ();
	}
	
	public int getCount() {
		return count;
	}

	public void add(Product book) {
		cart.add(book);
		count++;
		price += book.getPrice();
		
	}

	public int getTotalPrice() {
		
		return price;
	}

}
