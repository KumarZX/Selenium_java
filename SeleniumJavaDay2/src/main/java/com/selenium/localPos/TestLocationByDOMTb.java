package com.selenium.localPos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils;

import java_cup.runtime.virtual_parse_stack;

public class TestLocationByDOMTb {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://www.taobao.com");
		Thread.sleep(1000);
		
		scrollFullpage(driver);		
		Thread.sleep(3000);
		WebElement element= driver.findElement(By.cssSelector("div.fashion-inner>h3>em"));
		
		scrollToElement(driver, element);
//		System.out.println(element.getText());
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void scrollFullpage(WebDriver driver) throws Exception {//滑动全页面
		JavascriptExecutor jsExecutor= (JavascriptExecutor)driver;
		long totalHeight= (long)jsExecutor.executeScript("return(document.body.scrollHeight)");
		int height= driver.manage().window().getSize().getHeight();
		for(int i=1; i<=totalHeight/height; i++) {
			jsExecutor.executeScript("window.scrollTo(arguments[0],arguments[1])", 0,i*height);
			Thread.sleep(2000);
		}
	}
	public static void scrollToElement(WebDriver driver, WebElement element) {//滑动到元素
		JavascriptExecutor jsExecutor= (JavascriptExecutor)driver;
		jsExecutor.executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x,element.getLocation().y-100);
	}
}
