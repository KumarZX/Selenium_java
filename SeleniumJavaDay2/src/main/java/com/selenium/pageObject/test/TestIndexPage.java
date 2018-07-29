package com.selenium.pageObject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.dataprovider.LoginDataProvider;
import com.selenium.pageObject.IndexPage;
import com.selenium.pageObject.LoginPage;
import com.utils.DriverUtils;
import com.utils.TestBase;

public class TestIndexPage extends TestBase {
  @Test(dataProvider="loginData",dataProviderClass=LoginDataProvider.class)
  public void test(String username, String password, String expectedResult) throws Exception {
		driver.get("http://localhost:5555/ECShop/index.php");
		IndexPage indexPage = new IndexPage(driver);
		indexPage.loginLink_click();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.input_username(username);
		loginPage.input_pwd(password);
		loginPage.click_submit();
		loginPage.check_login_result(expectedResult);
		
//		IndexPage indexPage= PageFactory.initElements(driver, IndexPage.class);
//		indexPage.loginLink.click();
		Thread.sleep(5000);
  }
}
