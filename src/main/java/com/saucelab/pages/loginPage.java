package com.saucelab.pages;

import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.saucelab.base.Base;

public class loginPage extends Base {

	Logger logs = StartLogging("loginPage");

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement Username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement PassTab;
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement Loginbtn;
	@FindBy(xpath = "//img[@class='bot_column']")
	WebElement Logo;
	

	public loginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean IslogoDisplayed() {
		logs.fatal(Logo);
		boolean Flag = Logo.isDisplayed();
		logs.info("Logo Isdisplayed value" + Flag);
		return Flag;
	}

	public String UsernameLable() {
		return Username.getAttribute("placeholder");
	}

	public String PasswordLable() {
		return PassTab.getAttribute("placeholder");
	}

	public void SignIn() throws IOException {
		Username.sendKeys(readConfigData("Username"));
		PassTab.sendKeys(readConfigData("Password"));
		Loginbtn.click();
	}

}
