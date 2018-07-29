package com.selenium.localPos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils;

public class TestLocationByTagName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk");
		
		driver.findElement(By.partialLinkText("检查情况")).click();
		
		for(int i=0; i<=3; i++) {
			driver.findElement(By.id("tianjia_buttoncdqk")).click();
		}
		WebElement table= driver.findElement(By.id("ctqk"));
		System.out.println("有"+table.findElements(By.tagName("tr")).size()+"行");//获取行数
		System.out.println("有"+table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("td")).size()+"列");//获取第一行的列数
		table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")).get(1).findElements(By.tagName("input")).get(1).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
