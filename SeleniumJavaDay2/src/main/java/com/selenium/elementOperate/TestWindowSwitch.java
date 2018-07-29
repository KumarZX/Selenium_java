package com.selenium.elementOperate;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.utils.DriverUtils;

public class TestWindowSwitch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://bbs.51testing.com/forum.php");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("软件测试新手上路")).click();	
		Thread.sleep(3000);
		String firstHandle=driver.getWindowHandle();//获取第一个窗口的ID
//		List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
//		list.get(0).click();
		List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]"));
		list.get(0).findElement(By.xpath("tr/th/a[3]")).click();
		Thread.sleep(3000);

		//获取第二个窗口的ID
		Set<String> windowsSet=driver.getWindowHandles();
		String secondHandle="";
		for(String handle:windowsSet) {
			if(!handle.equals(firstHandle)) {
				secondHandle= handle;
				break;
			}
		}
		
		driver.switchTo().window(firstHandle);
		Thread.sleep(3000);
		
		list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		list.get(1).click();
		Thread.sleep(2000);
		
		//获取第三个窗口的ID	
		String thirdHanle="";
		windowsSet=driver.getWindowHandles();
		for(String  hanle:windowsSet) {
			if (!hanle.equals(firstHandle)&&!hanle.equals(secondHandle)) {
				thirdHanle= hanle;
				break;
			}
		}
		System.out.println(firstHandle);
		System.out.println(secondHandle);
		System.out.println(firstHandle);
		
		driver.switchTo().window(firstHandle);
		Thread.sleep(3000);
		
		list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		list.get(2).click();
		Thread.sleep(2000);
		
		String forthHanle="";
		windowsSet=driver.getWindowHandles();
		for(String  hanle:windowsSet) {
			if (!hanle.equals(firstHandle)&&!hanle.equals(secondHandle)&&!hanle.equals(thirdHanle)) {
				forthHanle= hanle;
				break;
			}
		}
		System.out.println(forthHanle);
			
		driver.switchTo().window(firstHandle);
		Thread.sleep(2000);
		driver.switchTo().window(secondHandle);
		Thread.sleep(2000);
		driver.switchTo().window(thirdHanle);
		Thread.sleep(2000);
		driver.switchTo().window(forthHanle);
		Thread.sleep(2000);
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("window.open('http://www.baidu.com')");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
