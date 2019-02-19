package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
}
