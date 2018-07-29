package com.selenium.elementOperate;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.DriverUtils;

public class TestWaitOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "chrome");
		WebDriver driver = DriverUtils.getDriver();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);//隐式等待时间为10s
		driver.get("http://localhost:5555/webtest/wait1");
		Thread.sleep(1000);
		
		driver.findElement(By.id("sid3")).click();
		driver.findElement(By.id("sid5")).click();
		//driver.findElement(By.id("sid8")).click();
		
		/*WebElement element=new WebDriverWait(driver, 20)
				.until(ExpectedConditions.presenceOfElementLocated(By.id("sid8")));
		element.click();*/
		
		WebElement element = new WebDriverWait(driver, 25).until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver t) {
				return t.findElement(By.id("sid8"));
			}
		});
		element.click();

		
		Thread.sleep(2000);
		driver.quit();
	}
}
