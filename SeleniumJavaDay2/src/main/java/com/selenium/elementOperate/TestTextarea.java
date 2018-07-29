package com.selenium.elementOperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils;

public class TestTextarea {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk");
		Thread.sleep(1000);
		driver.findElement(By.id("xingMin")).sendKeys("zhangsan");
		Thread.sleep(1000);
		driver.findElement(By.id("xingMin")).clear();
		driver.findElement(By.id("vcYffyqk")).sendKeys("aaaaa\nbbbbb\nccccc");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
