package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestAddParamenter1 {
	
	Calculator calculator;
	
  @Test(dataProvider = "param")
  public void f(int num1, int num2, int expectedResult) {
	  calculator.add(num1);
	  calculator.add(num2);
	  int result=calculator.getResult();
	  Assert.assertEquals(result, expectedResult);
  }
  @BeforeMethod
  public void beforeMethod() {
	  calculator.clear();
  }

  @BeforeClass
  public void beforeClass() {
	  calculator = new Calculator();
  }

  @AfterClass
  public void afterClass() {
	  calculator=null;
  }

  @DataProvider
  public Object[][] param() {
    return new Object[][] {
      new Object[] { 1, 2, 3 },
      new Object[] { 2, 3, 5 },
      new Object[] { 5, 6, 11 },
    };
  }


}
