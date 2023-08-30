package com.saucelab.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.base.Base;

public class OverViewPage extends Base{
	
	Logger logs = StartLogging("OverViewPage");

	@FindBy (xpath = "//a[@class='btn_action cart_button']") WebElement Finishbtn;
	@FindBy (xpath = "//a[@class='cart_cancel_link btn_secondary']") WebElement Cancelbtn;
	
	public OverViewPage()
	{
		logs.fatal(driver);
		PageFactory.initElements(GetDriver(), this);
	}
	
	public void CheckoutOverview()
	{
		Finishbtn.click();
		//return new finishPage();
	}
	
}
