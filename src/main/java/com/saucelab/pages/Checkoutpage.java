package com.saucelab.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.base.Base;

public class Checkoutpage extends Base {

	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	WebElement Checkoutbtn;

	public Checkoutpage() {
		PageFactory.initElements(driver, this);
	}

	public YourInformationPage proccedToCheckout() throws IOException {

		Checkoutbtn.click();
		return new YourInformationPage();

	}

}
