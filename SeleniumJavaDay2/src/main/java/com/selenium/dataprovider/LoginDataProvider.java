package com.selenium.dataprovider;


import org.testng.annotations.DataProvider;


public class LoginDataProvider {
	
  @DataProvider(name="loginData")
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "zhangsan", "123456", "登录成功" },
      new Object[] { "lisi", "123456", "用户名或密码错误" },
    };
  }
	
    @DataProvider(name="AdminloginData")
    public Object[][] admindata() {
      return new Object[][] {
        new Object[] { "Administrator", "!QAZ2wsx3edc" },
      };
  }


}
