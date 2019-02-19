package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Main.Product;
import Main.ShoppingCart;

public class ShoppingCartTesting {

	ShoppingCart cart;
	
	@Before
	public void initialize() {
		cart = new ShoppingCart();
	}
	
	@Test
	public void TC1Test() {
		assertTrue(cart.getCount()==0);
	}
	
	@Test
	public void TC2Test() {
		Product book = new Product();
		book.setName("Java Book");
		book.setPrice(127);
		cart.add(book);
		assertTrue(cart.getCount()==1);
		assertTrue(cart.getTotalPrice()==127);
	}
}
