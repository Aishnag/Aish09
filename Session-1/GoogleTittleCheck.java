package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTittleCheck {
	
	public static void main(String[] args) {
		String driver_path="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		String BaseURL="http://www.google.com";
		String expectedTittle="Google";
		String actualTittle="";
		
		WebDriver driver =new ChromeDriver();
		
		driver.get(BaseURL);
		actualTittle =driver.getTitle();
		
		///compare the tittle////
		if (actualTittle.contentEquals(expectedTittle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		///close chrome
		driver.close();
	}

}
