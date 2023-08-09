package com.saucelab.Testcases;

import org.testng.annotations.Test;

import com.saucelab.base.Base;
import com.saucelab.pages.finishPage;

public class FinishPageTest extends Base {

	@Test(priority = 5)
	public void FinishTest() {

		new finishPage().Logout();

	}

}
