package com.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class scrollFullpage {

	public static void scrollfullpage(WebDriver driver) throws Exception {//滑动全页面
		JavascriptExecutor jsExecutor= (JavascriptExecutor)driver;
		long totalHeight= (long)jsExecutor.executeScript("return(document.body.scrollHeight)");
		int height= driver.manage().window().getSize().getHeight();
		for(int i=1; i<=totalHeight/height; i++) {
			jsExecutor.executeScript("window.scrollTo(arguments[0],arguments[1])", 0,i*height);
			Thread.sleep(2000);
		}
	}

}
