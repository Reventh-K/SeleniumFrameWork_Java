package com.saucelab.Testcases;

import org.testng.annotations.Test;

import com.saucelab.base.Base;
import com.saucelab.pages.OverViewPage;

public class OverViewPageTest extends Base{
	
	@Test(priority = 4)
	public void OverviewTest() {
		new OverViewPage().CheckoutOverviewtest();
	}

}
