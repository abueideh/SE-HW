package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Main.Product;
import Main.ShoppingCart;

public class ShoppingCartTest {

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
	
	@Test
	public void TC3test() {
		Product book1 = new Product();
		book1.setName("Java Book");
		book1.setPrice(127);
		Product book2 = new Product();
		book2.setName("Web design Book");
		book2.setPrice(100);
		cart.add(book1);
		cart.add(book2);
		assertTrue(cart.getCount()==2);
		assertTrue(cart.getTotalPrice()==227);
	}
}
