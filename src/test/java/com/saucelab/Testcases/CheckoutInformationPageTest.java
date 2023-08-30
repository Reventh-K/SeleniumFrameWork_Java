package com.saucelab.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucelab.pages.CheckoutInformationPage;
import com.saucelab.pages.ProductPage;
import com.saucelab.pages.YourCartPage;
import com.saucelab.pages.loginPage;

public class CheckoutInformationPageTest extends CheckoutInformationPage {

	loginPage lp = new loginPage();
	ProductPage pp = new ProductPage();
	YourCartPage ycp = new YourCartPage();
	
	@Test
	private void TestSetup() throws IOException {
		ApplicatSetup();
		lp.SignIn();
		pp.productSelection();
		ycp.proccedToCheckout();
	}
	
	@Test
	public void yourinformationTest() throws IOException {
		Checkout();
	}

}
