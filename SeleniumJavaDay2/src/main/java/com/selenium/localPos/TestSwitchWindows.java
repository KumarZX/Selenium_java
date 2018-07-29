package com.selenium.localPos;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils;

public class TestSwitchWindows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();

		driver.get("http://bbs.51testing.com/forum.php");
		Thread.sleep(3000);
		String firstHandle=driver.getWindowHandle();
		
		driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		Thread.sleep(3000);

		
		List<WebElement> list= driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		list.get(0).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		list= driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		list.get(1).click();
		
		//Set<String> windowsSet = driver.getWindowHandles();
		
		Thread.sleep(3000);
		driver.quit();
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
}
