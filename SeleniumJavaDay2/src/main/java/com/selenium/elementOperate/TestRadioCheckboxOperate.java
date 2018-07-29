package com.selenium.elementOperate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils;

public class TestRadioCheckboxOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='vcGgyy' and @value='3']")).click();
		Thread.sleep(1000);
		
		List<WebElement> radios =driver.findElements(By.xpath("//input[@name='vcGgyy' and @value<='4']"));
		for(WebElement radio:radios) {
			Thread.sleep(1000);
			radio.click();
		}
		
		driver.findElement(By.xpath("//input[@name='vcGgyy' and @value='3']")).click();
		Thread.sleep(1000);
		for(WebElement radio:radios) {
			if(radio.isSelected()) {
				System.out.println("选中的值1是"+radio.getAttribute("value"));
				break;
			}
		}
		for(WebElement radio:radios) {
			if(radio.getAttribute("checked")!=null) {
				System.out.println("选中的值2是"+radio.getAttribute("value"));
				break;
			}
		}
		
		List<WebElement> checks =driver.findElements(By.name("vcJsfs"));
		for(int i=0; i<checks.size(); i++) {
			if(i%2!=0) {
				Thread.sleep(1000);
				checks.get(i).click();
			}
		}
		for(int i=0; i<checks.size(); i++) {
			if(i%2!=0) {
				Thread.sleep(1000);
				if (checks.get(i).getAttribute("checked")!=null) {
					System.out.println("选中的值是"+checks.get(i).getAttribute("value")+",");
				}
			}
		}
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
