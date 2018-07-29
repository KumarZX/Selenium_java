package com.selenium.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {
  @FindBy(name="username")
  public WebElement user;
  @FindBy(name="password")
  public WebElement pwd;
  @FindBy(name="submit")
  public WebElement submit;
  @FindBy(css="div.boxCenterList.RelaArticle>div>p:nth-of-type(1)")
  public WebElement login_result_txt;
  
  
  
  public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void input_username(String username) {
		user.sendKeys(username);
	}
	public void input_pwd(String password) {
		pwd.sendKeys(password);
	}
	public void click_submit() {
		submit.click();
	}
	public void check_login_result(String expectedResult) {
		Assert.assertEquals(login_result_txt.getText(), expectedResult);
		System.out.println(expectedResult);
	}
}
