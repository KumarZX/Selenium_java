package com.selenium.elementOperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.utils.DriverUtils;

public class TestMouseOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "ie");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='vcGgyy' and @value=3]")).click();;
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.doubleClick(driver.findElement(By.xpath("//input[@name='vcGgyy' and @value=3]"))).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
