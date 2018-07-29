package com.testing.day2;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxBaidu {


	public static void main(String[] args) {
		
		//设置webdriver驱动路径
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		
		FirefoxOptions firefoxoptions = new FirefoxOptions();

		// 设置Firefox的执行路径，
		firefoxoptions.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//firefoxoptions.setBinary(new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")));

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		//单窗口关闭
		driver.close();
		
		driver = new FirefoxDriver();
		driver.get("http://www.jd.com");
		//全部退出
		driver.quit();
	} 

}
