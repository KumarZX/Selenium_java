package com.selenium.pageObject;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.WebRequest;

public class UserPage {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name=\"username\"]")
	public WebElement user;
	@FindBy(xpath="//input[@name=\"password\"]")
	public WebElement psw;
	@FindBy(xpath=".btn-a")
	public WebElement login;
	@FindBy(partialLinkText="会员列表")
	public WebElement user_list;
	
	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Username(String username) {
		user.sendKeys(username);
	}
	public void Password(String password) {
		psw.sendKeys(password);
	}
	public void Login() {
		login.click();
	}
	public void UserList_Click() {
		driver.switchTo().frame("header-frame");
		user_list.click();
	}
}
