package com.selenium.testng;

public class TestAddByMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		calculator.clear();
		calculator.add(1);
		calculator.add(2);
		int result=calculator.getResult();
		
		if (result==3) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
