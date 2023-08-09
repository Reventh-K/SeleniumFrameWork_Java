package com.saucelab.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage extends com.saucelab.base.Base {

	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement ZipCode;
	@FindBy(xpath = "//input[@value='CONTINUE']")
	WebElement continueBtn;

	public YourInformationPage() {
		PageFactory.initElements(driver, this);
	}

	public OverViewPage Checkout() throws IOException {

		firstName.sendKeys(readConfigData("Name"));
		lastName.sendKeys(readConfigData("Last"));
		ZipCode.sendKeys(readConfigData("ZipCode"));
		continueBtn.click();
		return new OverViewPage();

	}

}
