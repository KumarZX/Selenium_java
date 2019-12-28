package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestBase {
	protected WebDriver driver;
	@BeforeSuite
	public void BeforeSuite() {
		System.setProperty("brower.type", "chrome");
		DriverUtils2.initService();
	}
	@Test
	public void OpenBaidu() throws InterruptedException {
		driver.get("http://www.baidu.com");
		driver.findElement(By.name("wd")).sendKeys("Selenium");
		Thread.sleep(5000);
	}
	
	@AfterSuite
	public void AfterSuite() {
		DriverUtils2.stopservice();
	}
	
	@BeforeMethod
	  public void beforeMethod() {
		 driver= DriverUtils2.getDriver();
	  }
	
	@AfterMethod
	  public void AfterMethod() {
		  driver.quit();
	  }
}
