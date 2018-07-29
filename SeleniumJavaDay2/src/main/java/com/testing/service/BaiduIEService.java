package com.testing.service;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaiduIEService {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InternetExplorerDriverService service = new InternetExplorerDriverService.Builder()
				.usingDriverExecutable(new File("C:\\driver\\IEDriverServer.exe"))
				.usingAnyFreePort().build();
		
		service.start();
		
		WebDriver driver = new RemoteWebDriver(service.getUrl(),
				DesiredCapabilities.internetExplorer());
		driver.get("http://www.baidu.com");
		Thread.sleep(1000);//Ïß³ÌµÈ´ý
		driver.close();
		
		//InternetExplorerOptions options = new InternetExplorerOptions();
		driver = new RemoteWebDriver(service.getUrl(),
				new InternetExplorerOptions());
		driver.get("http://www.jd.com");
		driver.close();
		
		service.stop();
	}

}
