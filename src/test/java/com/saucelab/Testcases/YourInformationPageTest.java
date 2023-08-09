package com.saucelab.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucelab.base.Base;
import com.saucelab.pages.YourInformationPage;

public class YourInformationPageTest extends Base {

	@Test(priority = 3)
	public void yourinformationTest() throws IOException {
		new YourInformationPage().Checkout();
	}

}
