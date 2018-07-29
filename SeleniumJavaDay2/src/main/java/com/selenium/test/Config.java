package com.selenium.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	public Properties pro = new Properties();//实例化Properties类
	public Config(String fileNmae) {
		String path=this.getClass().getClassLoader().getResource(fileNmae).getPath();//获取properties文件路径
		try {
			pro.load(new FileInputStream(path));//加载properties文件
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * 通过key读取value
	 */
	
	public String getConfig(String key) {
		return pro.getProperty(key);
	}
	public static void main(String [] args) {
		Config config=new Config("config.properties");
		String fireDriverPath=config.getConfig("firefoxDriver");
		System.out.println(fireDriverPath);
	}
}
