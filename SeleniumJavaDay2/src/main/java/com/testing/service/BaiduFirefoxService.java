package com.testing.service;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaiduFirefoxService {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		GeckoDriverService service = new GeckoDriverService.Builder()
				.usingDriverExecutable(new File("C:\\driver\\geckodriver.exe"))
				.usingFirefoxBinary(new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")))
				.usingAnyFreePort().build();
		
		service.start();
		
		WebDriver driver = new RemoteWebDriver(service.getUrl(),
				DesiredCapabilities.firefox());
		driver.get("http://www.baidu.com");
		driver.close();
		
		driver = new RemoteWebDriver(service.getUrl(),
				new FirefoxOptions());
		driver.get("http://www.jd.com");
		driver.close();
		
		service.stop();
	}
}
