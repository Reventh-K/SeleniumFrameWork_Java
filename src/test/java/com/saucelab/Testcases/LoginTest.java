package com.saucelab.Testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.saucelab.base.Base;
import com.saucelab.pages.loginPage;

public class LoginTest extends Base{
	
	@Test(priority = 0)
	public void Login() throws IOException{
		loginPage lp = new loginPage();
		lp.SignIn();
		
	}

}
