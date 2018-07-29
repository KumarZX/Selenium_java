package com.selenium.elementOperate;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils;

public class TestFrameOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "ie");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/EcShop/admin");
		Thread.sleep(1000);
		
		driver.findElement(By.name("username")).sendKeys("Administrator");;
		driver.findElement(By.name("password")).sendKeys("!QAZ2wsx3edc");;
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("menu-frame");
		driver.findElement(By.partialLinkText("商品列表")).click();
		
		driver.switchTo().defaultContent();//跳转到原始位置
		driver.switchTo().frame("header-frame");//跳入其他的frame
		driver.findElement(By.partialLinkText("帮助")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
