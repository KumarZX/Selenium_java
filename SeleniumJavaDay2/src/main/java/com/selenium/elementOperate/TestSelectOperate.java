package com.selenium.elementOperate;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

import com.utils.DriverUtils;

public class TestSelectOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk");
		Thread.sleep(1000);
		
		Select select= new Select(driver.findElement(By.name("vcZy")));
		select.selectByVisibleText("学生");
		Thread.sleep(1000);
		
		select.selectByIndex(4);//index是从0往下数的
		Thread.sleep(1000);
		
		select.selectByValue("10");
		//判断哪个被选中
		for(int i=0; i<select.getOptions().size();i++) {
			if(select.getOptions().get(i).getAttribute("selected")!=null){
				System.out.println(select.getOptions().get(i).getText());//打印显示的文本
				System.out.println(select.getOptions().get(i).getAttribute("value"));//打印Value的值
				break;
			}
		}
		Thread.sleep(2000);
		select.selectByIndex(0);;
		
		for(int i=0; i<select.getOptions().size();i++) {
			Thread.sleep(500);
			select.selectByIndex(i);
		}	
		
		driver.findElement(By.partialLinkText("检查情况")).click();
		Select select1= new Select(driver.findElement(By.name("vcZy1")));
		select1.selectByVisibleText("学生");
		select1.selectByIndex(4);
		select1.selectByValue("05");
		System.out.println(select.getFirstSelectedOption().getText());
		select1.deselectByIndex(4);//只能适用于多选下拉式列表框
		
		for(int i=0; i<select1.getOptions().size();i++) {
			if(select1.getOptions().get(i).getAttribute("selected")!=null){
				System.out.println(select1.getOptions().get(i).getText());//打印显示的文本
				System.out.println(select1.getOptions().get(i).getAttribute("value"));//打印Value的值
			}
		}
		Thread.sleep(1000);
		select1.deselectAll();
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
