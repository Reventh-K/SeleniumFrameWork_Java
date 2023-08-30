package com.saucelab.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.base.Base;

public class finishPage extends Base {

	Logger logs = StartLogging("finishPage");
	
	@FindBy(xpath = "//button[normalize-space()='Open Menu']")
	WebElement sidebar;
	@FindBy(xpath = "//a[@id='inventory_sidebar_link']")
	WebElement SB_Inventory;
	@FindBy(xpath = "//a[@id='about_sidebar_link']")
	WebElement SB_about;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement SB_Logout;
	@FindBy(xpath = "//a[@id='reset_sidebar_link']")
	WebElement SB_ResetAppState;

	public finishPage() {
		logs.fatal(driver);
		PageFactory.initElements(GetDriver(), this);
	}

	public void Inventory() {
		sidebar.click();
		SB_Inventory.click();

		logs.info("Inventory loaded");
	}

	public void about() {
		sidebar.click();
		SB_about.click();
		logs.info("about loaded");
	}

	public void Logout() {
		sidebar.click();
		SB_Logout.click();
		logs.info("Logout loaded");
	}

	public void ResetAppState() {
		sidebar.click();
		SB_ResetAppState.click();
		logs.info("ResetAppState loaded");
	}

}
