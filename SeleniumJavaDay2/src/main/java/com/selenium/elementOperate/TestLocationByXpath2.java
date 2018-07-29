package com.selenium.elementOperate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils;

public class TestLocationByXpath2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();

		driver.get("http://bbs.51testing.com/forum.php");
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		Thread.sleep(5000);
		
		List<WebElement> list= driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		list.get(0).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
