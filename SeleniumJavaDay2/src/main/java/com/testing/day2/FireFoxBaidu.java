package com.testing.day2;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxBaidu {


	public static void main(String[] args) {
		
		//����webdriver����·��
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		
		FirefoxOptions firefoxoptions = new FirefoxOptions();

		// ����Firefox��ִ��·����
		firefoxoptions.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//firefoxoptions.setBinary(new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")));

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		//�����ڹر�
		driver.close();
		
		driver = new FirefoxDriver();
		driver.get("http://www.jd.com");
		//ȫ���˳�
		driver.quit();
	} 

}
