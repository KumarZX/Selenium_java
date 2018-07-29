package com.selenium.elementOperate;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.utils.DriverUtils;

public class TestFileOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "ie");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk");
		Thread.sleep(1000);
		
		driver.findElement(By.name("vcWjSc")).sendKeys("c:\\my.txt");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
