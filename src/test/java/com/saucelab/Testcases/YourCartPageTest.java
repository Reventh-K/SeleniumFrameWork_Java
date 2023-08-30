package com.saucelab.Testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.saucelab.pages.ProductPage;
import com.saucelab.pages.YourCartPage;
import com.saucelab.pages.loginPage;

public class YourCartPageTest extends YourCartPage{
	
	loginPage lp = new loginPage();
	ProductPage pp = new ProductPage();
	@Test
	private void TestSetup() throws IOException {
		ApplicatSetup();
		lp.SignIn();
		pp.productSelection();	
	}
	
	@Test
	public void shoppingCartTest() throws IOException {
		
		 proccedToCheckout();
	}

}
