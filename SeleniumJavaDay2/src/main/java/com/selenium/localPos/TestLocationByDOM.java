package com.selenium.localPos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils;

public class TestLocationByDOM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk");
		
		JavascriptExecutor jsExecutor= (JavascriptExecutor)driver;
		jsExecutor.executeScript("document.getElementsByName('dtDyjsrq')[0].parentNode.childNodes[2].click()");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
