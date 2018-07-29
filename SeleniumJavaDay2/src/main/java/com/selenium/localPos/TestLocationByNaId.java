package com.selenium.localPos;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils;

public class TestLocationByNaId {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("brower.type", "ie");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk");
		
		List<WebElement> radios= driver.findElements(By.name("vcFf"));
		radios.get(1).click();
		
//		for(WebElement el:radios) {
//			el.click();
//			Thread.sleep(2000);
//		}

		  for(int i=0; i<radios.size(); i++){
			  System.out.println("第"+(i+1)+"个："+radios.get(i).isSelected());
			  WebElement element = radios.get(i);
			  if (element.isSelected()) {
				System.out.println("被选中的值为："+element.getAttribute("value"));
			}
			  Thread.sleep(1000);
		  }	 
		 		
		Thread.sleep(1000);
		driver.quit();
	}

}
