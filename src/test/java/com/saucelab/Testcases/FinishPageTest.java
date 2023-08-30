package com.saucelab.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucelab.pages.CheckoutInformationPage;
import com.saucelab.pages.OverViewPage;
import com.saucelab.pages.ProductPage;
import com.saucelab.pages.YourCartPage;
import com.saucelab.pages.finishPage;
import com.saucelab.pages.loginPage;

public class FinishPageTest extends finishPage {
	loginPage lp = new loginPage();
	ProductPage pp = new ProductPage();
	YourCartPage ycp = new YourCartPage();
	CheckoutInformationPage CIP = new CheckoutInformationPage();
	OverViewPage OVP = new OverViewPage();
	
	@Test
	private void TestSetup() throws IOException {
		ApplicatSetup();
		lp.SignIn();
		pp.productSelection();
		ycp.proccedToCheckout();
		CIP.Checkout();
		OVP.CheckoutOverview();
	}
	@Test
	public void FinishTest() {

		Logout();

	}

}
