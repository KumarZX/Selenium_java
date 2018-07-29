package com.selenium.testng;

import org.testng.annotations.Test;

public class TestRunByGroups {
  @Test(groups="car")
  public void car1() {
	  System.out.println("buick");
  }
}
