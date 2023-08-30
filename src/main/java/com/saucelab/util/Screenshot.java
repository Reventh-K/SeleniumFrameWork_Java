package com.saucelab.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.saucelab.base.Base;

public class Screenshot extends Base{

	public void takeScreenshot() throws IOException {
		//Time stamp Generator
		java.util.Date date = new java.util.Date();
		String datestamp = date.toString().replace(" ", "-").replace(":", "-");
		
		//Screenshot Util
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshots//" + datestamp + ".png"));
		
	}
}
