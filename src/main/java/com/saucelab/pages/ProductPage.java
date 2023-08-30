package com.saucelab.pages;

import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.saucelab.base.Base;

public class ProductPage extends Base {

	Logger logs = StartLogging("ProductPage");

	@FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
	WebElement P1AddtoCart;
	@FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
	WebElement P2AddtoCart;
	@FindBy(xpath = "//*[name()='path' and contains(@fill,'currentCol')]")
	WebElement Cartbtn;
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement priceFilterddElement;

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	public void PriceFilterDropdown() {

		Select select = new Select(priceFilterddElement);
		select.selectByValue("lohi");
	}

	public void productSelection() throws IOException {
		logs.info("Product page loaded");
		P1AddtoCart.click();
		P2AddtoCart.click();
		logs.info("Added products to cart");
		Cartbtn.click();
		//return new Checkoutpage();

	}

}
