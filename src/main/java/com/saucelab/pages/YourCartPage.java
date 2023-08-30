package com.saucelab.pages;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.base.Base;

public class YourCartPage extends Base {
	Logger logs = StartLogging("Checkoutpage");
	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	WebElement Checkoutbtn;
	

	public YourCartPage() {
		PageFactory.initElements(GetDriver(), this);
	}

	public void proccedToCheckout() throws IOException {
		
		Checkoutbtn.click();
		logs.info("Checkout succesful");
		//return new YourInformationPage();

	}

}
