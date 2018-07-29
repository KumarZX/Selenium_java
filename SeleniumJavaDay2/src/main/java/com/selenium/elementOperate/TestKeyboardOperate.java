package com.selenium.elementOperate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.utils.DriverUtils;

public class TestKeyboardOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("brower.type", "ie");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/EcShop/admin");
		Thread.sleep(1000);
		
		driver.findElement(By.name("username")).sendKeys("Administrator");
		driver.findElement(By.name("password")).sendKeys("!QAZ2wsx3edc");
		
		//第一种方式，常用
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		
		//第二种方式，确定点击哪个元素
		//driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
