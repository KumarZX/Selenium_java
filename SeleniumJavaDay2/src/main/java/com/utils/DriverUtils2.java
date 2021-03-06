package com.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

import com.selenium.test.Config;

public class DriverUtils2 {
	
	public static DriverService service;
	public static String brower = null;
	public static Config config =new Config("config.properties");
	
	public static void initService() {
		brower= System.getProperty("brower.type", "firefox");//获取浏览器类型，默认浏览器Firefox
		String firePath=config.getConfig("firefoxPath");
		String fireDriverPath=config.getConfig("firefoxDriver");
		String chromeDriverPath=config.getConfig("chromeDriver");
		String ieDriverPath=config.getConfig("ieDriver");
		if("firefox".equalsIgnoreCase(brower)) {//根据获取到的浏览器类型，判断使用不同的service
			service = new GeckoDriverService.Builder()
					.usingDriverExecutable(new File(fireDriverPath))
					.usingFirefoxBinary(new FirefoxBinary(new File(firePath)))
					.usingAnyFreePort().build();
			
		}else if("chrome".equalsIgnoreCase(brower)) {
			service = new ChromeDriverService.Builder()
					.usingDriverExecutable(new File(chromeDriverPath))
					.usingAnyFreePort().build();
			
		}else if("ie".equalsIgnoreCase(brower)) {
			service = new InternetExplorerDriverService.Builder()
					.usingDriverExecutable(new File(ieDriverPath))
					.usingAnyFreePort().build();
		}else {
			throw new RuntimeException("设置浏览器有误！");//如果使用三种浏览器之外的浏览器类型就会报错
		}
		
		try {//启动服务，并捕获异常
			service.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * 获取WebDriver静态方法
	 * 
	 */
	
	public static WebDriver getDriver(){//根据浏览器的类型，获取WebDriver
		WebDriver driver = null;
		if ("firefox".equalsIgnoreCase(brower)) {
			driver = new RemoteWebDriver(service.getUrl(),
					new FirefoxOptions());
		}else if("chrome".equalsIgnoreCase(brower)) {
			driver = new RemoteWebDriver(service.getUrl(),
					new ChromeOptions());			
		}else {
			driver = new RemoteWebDriver(service.getUrl(),
					new InternetExplorerOptions());
		}
		return driver;
	}
	
//	public static void stopdriver() {
//		//driver.close();
//		service.stop();
//	}
	
	public static void stopservice() {
		//driver.close();
		service.stop();
	}

}
