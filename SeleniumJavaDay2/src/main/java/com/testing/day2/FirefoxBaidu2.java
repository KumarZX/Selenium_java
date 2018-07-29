package com.testing.day2;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

public class FirefoxBaidu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, "C:\\driver\\geckodriver.exe");
		
		FirefoxOptions firefoxoptions = new FirefoxOptions();
		firefoxoptions.setBinary(new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")));

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		
		
		//单窗口关闭
		driver.close();
		//全部退出
		driver.quit();
	}

}
