package com.saucelab.pages;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.base.Base;

public class CheckoutInformationPage extends Base {

	Logger logs = StartLogging("YourInformationPage");

	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement ZipCode;
	@FindBy(xpath = "//input[@value='CONTINUE']")
	WebElement continueBtn;

	public CheckoutInformationPage() {
		logs.fatal(driver);
		PageFactory.initElements(GetDriver(), this);
	}

	public void Checkout() throws IOException {

		logs.info("Entering infomations");
		firstName.sendKeys(readConfigData("Name"));
		lastName.sendKeys(readConfigData("Last"));
		ZipCode.sendKeys(readConfigData("ZipCode"));
		continueBtn.click();
		logs.info("Checking out successful");
		//return new OverViewPage();

	}

}
