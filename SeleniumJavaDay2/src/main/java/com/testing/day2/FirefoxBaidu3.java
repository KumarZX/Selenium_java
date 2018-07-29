package com.testing.day2;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

public class FirefoxBaidu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeckoDriverService service = new GeckoDriverService.Builder()
				.usingDriverExecutable(new File("C:\\driver\\geckodriver.exe"))
				.usingFirefoxBinary(new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")))
				.usingAnyFreePort().build();

		
		WebDriver driver = new FirefoxDriver(service);
		driver.get("http://www.baidu.com");
		
		
		//单窗口关闭
		driver.close();
		//全部退出
		driver.quit();
	}

}
