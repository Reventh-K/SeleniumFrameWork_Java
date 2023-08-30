package com.saucelab.Testcases;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.saucelab.pages.loginPage;

public class LoginTest extends loginPage {

	Logger logs = StartLogging("LoginTest");
	loginPage lp = new loginPage();
	
	@BeforeClass
	private void Testsetup()
	{
		
		ApplicatSetup();
	}
	@AfterClass
	private void TestTearDown() {
		driver.close();
	}
	@Test
	public void VerifyPageTitle() throws IOException, InterruptedException {
		
		String actualTitle = driver.getTitle();
		String ExpectedTitle = readConfigData("ExpectedTitle");
		assertEquals(actualTitle, ExpectedTitle);
	}
	@Test
	public void VerifyPageLogo() {
		boolean flag = IslogoDisplayed();
		assertEquals(flag, true);
	}

	@Test
	public void VerifyPageURL() throws IOException {
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = readConfigData("ExpectedURLLoginPage");
		assertEquals(ActualURL, ExpectedURL);
	}

	@Test
	public void VerifyLabels() throws IOException {

		String ExpectedUserNameLabel = readConfigData("ExpectedUsernameLabel");
		String ExpectedPasswordLabel = readConfigData("ExpectedPasswordLabel");

		assertEquals(UsernameLable(), ExpectedUserNameLabel);
		assertEquals(PasswordLable(), ExpectedPasswordLabel);
	}

	@Test(priority = 4)
	public void Login() throws IOException {
		SignIn();
	}

}
