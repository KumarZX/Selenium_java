package com.selenium.localPos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils;

public class TestBaiduLocaByName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "ie");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://www.baidu.com");
		driver.findElement(By.name("wd")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver.quit();
	}

}
