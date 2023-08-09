package com.saucelab.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.base.Base;

public class loginPage extends Base {

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement Username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement PassTab;
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement Loginbtn;

	public loginPage() {
		PageFactory.initElements(driver, this);
	}

	public ProductPage SignIn() throws IOException {
		Username.sendKeys(readConfigData("Username"));
		PassTab.sendKeys(readConfigData("Password"));
		Loginbtn.click();
		return new ProductPage();

	}

}
