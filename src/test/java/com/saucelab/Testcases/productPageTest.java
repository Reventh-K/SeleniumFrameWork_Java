package com.saucelab.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucelab.base.Base;
import com.saucelab.pages.ProductPage;

public class productPageTest extends Base{

	@Test(priority = 1)
	public void AddItemToCartTest() throws IOException {
		new ProductPage().productSelection();
	}
}
