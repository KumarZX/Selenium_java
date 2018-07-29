package com.selenium.pageObject.test;

import org.testng.annotations.Test;
import com.selenium.dataprovider.LoginDataProvider;
import com.selenium.pageObject.UserPage;
import com.utils.TestBase;

public class TestUserPage extends TestBase {

	@Test(dataProvider="AdminloginData",dataProviderClass=LoginDataProvider.class)
	public void UserList(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		driver.get("http://localhost:5555/EcShop/admin");
		UserPage userPage= new UserPage(driver);
		userPage.Username(username);
		userPage.Password(password);
		userPage.Login();
		Thread.sleep(3000);
		userPage.UserList_Click();
		Thread.sleep(2000);
	}

}
