package com.testing.service;

import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils;

public class TestBaidu {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("brower.type", "ie");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://www.baidu.com");
		Thread.sleep(1000);
		driver.quit();
	}

}
