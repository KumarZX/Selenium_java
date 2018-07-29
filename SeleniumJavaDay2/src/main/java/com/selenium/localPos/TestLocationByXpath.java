package com.selenium.localPos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils;

public class TestLocationByXpath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk");
		driver.findElement(By.xpath("//input[@name='dtDyjsrq']/following-sibling::img")).click();
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
