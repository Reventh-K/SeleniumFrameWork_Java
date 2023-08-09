package com.saucelab.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static String browser;
	public static WebDriver driver;

	// Browser installization
	@BeforeSuite
	public void browserSetup() throws IOException {

		browser = readConfigData("browser");

		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(readConfigData("TestURL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}

	// Reading properties using FileInputStream
	public String readConfigData(String Key) throws IOException {

		Properties prop = new Properties();
		FileInputStream IStream = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\TestData\\ConfigData.properties");
		prop.load(IStream);
		String value = prop.getProperty(Key);
		return value;
	}

}
