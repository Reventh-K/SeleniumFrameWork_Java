package com.saucelab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverViewPage extends com.saucelab.base.Base{

	@FindBy (xpath = "//a[@class='btn_action cart_button']") WebElement Finishbtn;
	@FindBy (xpath = "//a[@class='cart_cancel_link btn_secondary']") WebElement Cancelbtn;
	
	public OverViewPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public finishPage CheckoutOverviewtest()
	{
		Finishbtn.click();
		return new finishPage();
	}
	
}
