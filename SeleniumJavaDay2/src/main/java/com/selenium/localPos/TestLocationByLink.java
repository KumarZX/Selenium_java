package com.selenium.localPos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

import com.utils.DriverUtils;

public class TestLocationByLink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "ie");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/ECShop/index");
		
		driver.findElement(By.linkText("请登录")).click();
		//driver.findElement(By.partialLinkText("登录")).click();
	
		Thread.sleep(2000);
		driver.quit();
	}

}
