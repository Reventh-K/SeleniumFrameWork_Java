package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.saucelab.pages.ProductPage;
import com.saucelab.pages.loginPage;

public class productPageTest extends ProductPage{
	
	loginPage lp = new loginPage();
	
	@BeforeClass
	private void TestSetup() throws IOException {
		ApplicatSetup();
		lp.SignIn();
	}
	@AfterClass
	private void TestTearDown() {
		driver.close();
	}

	@Test(priority = 7)
	public void AddItemToCartTest() throws IOException {
		productSelection();
	}
	@Test(priority = 5)
	public void verifyURL() throws IOException
	{
		String ExpectedURL = readConfigData("ExpectedURLProductPage");
		String ActualURL = driver.getCurrentUrl();
		assertEquals(ActualURL, ExpectedURL);
		
	}
	@Test(priority = 6)
	public void VerifyFilterDropDown() {
		PriceFilterDropdown();
		
	}
	
}

