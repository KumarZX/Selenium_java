package com.selenium.localPos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils;

public class TestLocationByCssName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "ie");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk");
		Thread.sleep(1000);
		System.out.println(driver.findElements(By.className("type1")).size());
		driver.findElements(By.className("type1")).get(0).sendKeys("abcde");
		Thread.sleep(1000);
		driver.quit();
	}
}
