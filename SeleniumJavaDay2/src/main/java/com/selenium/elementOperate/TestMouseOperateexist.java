package com.selenium.elementOperate;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.utils.DriverUtils;

public class TestMouseOperateexist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "chrome");
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
		
		Actions actions =new Actions(driver);
		actions.moveToElement(driver.findElement(By.partialLinkText("个人设置"))).pause(7000).perform();
		actions.moveToElement(driver.findElement(By.linkText("退出"))).click().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);

		driver.quit();
		
	}
}
