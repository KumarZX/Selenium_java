package com.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	protected WebDriver driver;
	@BeforeSuite
	public void BeforeSuite() {
		System.setProperty("brower.type", "ie");
		DriverUtils2.initService();
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
