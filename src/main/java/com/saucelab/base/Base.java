package com.saucelab.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	Logger logs = StartLogging("Base");
	public static String browser;
	public static String testURL;
	public WebDriver driver =GetDriver() ;

	public WebDriver GetDriver(){
		//Fetching data from properties file
		try {
			browser = readConfigData("browser");
			testURL = readConfigData("TestURL");
		}catch (IOException e) {
			e.printStackTrace();
		}
		//Setting up Webdriver
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logs.fatal("New window Opened");
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;
	}
	
	public void ApplicatSetup() {
		driver.get(testURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	//@AfterSuite
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
	//init log4J
	public org.apache.logging.log4j.Logger StartLogging(String ClassName) {
		org.apache.logging.log4j.Logger logger = LogManager.getLogger(ClassName);
		return logger;
	}

}
