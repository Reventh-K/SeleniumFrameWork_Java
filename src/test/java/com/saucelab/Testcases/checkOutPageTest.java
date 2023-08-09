package com.saucelab.Testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.saucelab.base.Base;
import com.saucelab.pages.Checkoutpage;

public class checkOutPageTest extends Base{
	
	@Test(priority = 2)
	public void shoppingCartTest() throws IOException {
		
		new Checkoutpage()
		.proccedToCheckout();
	}

}
