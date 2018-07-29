package com.testing.service;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaiduChromeService {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriverService service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File("C:\\driver\\chromedriver.exe"))
				.usingAnyFreePort().build();
		
		service.start();
		
		WebDriver driver = new RemoteWebDriver(service.getUrl(),
				DesiredCapabilities.chrome());
		driver.get("http://www.baidu.com");
		Thread.sleep(1000);//Ïß³ÌµÈ´ý
		driver.close();
		
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.setBinary(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"));
		driver = new RemoteWebDriver(service.getUrl(),
				chromeoptions);
		driver.get("http://www.jd.com");
		driver.close();
		
		service.stop();
	}

}
