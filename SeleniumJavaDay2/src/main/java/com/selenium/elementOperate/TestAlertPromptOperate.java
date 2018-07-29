package com.selenium.elementOperate;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils;

public class TestAlertPromptOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "chrome");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk");
		Thread.sleep(1000);

		driver.findElement(By.partialLinkText("检查情况")).click();
		driver.findElement(By.cssSelector("select[name='vcZy1']+input")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("zhangsan");//prompt对话框输入值
		
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		alert.accept();
		//alert.dismiss(); //取消输入
		driver.findElement(By.xpath("//select[@name='vcZy1']/following-sibling::input[3]")).click();
		Thread.sleep(1000);
		alert= driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
