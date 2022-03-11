package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	public static void main(String[] args) {
		
		////step-1 declare path
		String driver_path="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		//System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		// initiate driver////
		WebDriver driver = new ChromeDriver();
		//// step-2 baseurl
		String BaseUrl ="http://www.google.com/";
		//// step-3 launch google chrome///
		driver.get(BaseUrl);
		driver.close();
		
	}

}
