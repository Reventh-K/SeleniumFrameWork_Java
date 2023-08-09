package com.saucelab.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.base.Base;

public class ProductPage extends Base {

	@FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
	WebElement P1AddtoCart;
	@FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
	WebElement P2AddtoCart;
	@FindBy(xpath = "//*[name()='path' and contains(@fill,'currentCol')]")
	WebElement Cartbtn;

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	public Checkoutpage productSelection() throws IOException {

		P1AddtoCart.click();
		P2AddtoCart.click();
		Cartbtn.click();
		return new Checkoutpage();
	}

}
