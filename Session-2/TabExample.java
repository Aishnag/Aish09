package com.simplilearn.demo;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabExample {
	
	public static void main(String[] args) {
		
		String driver_path="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver = new ChromeDriver();
		
		///launching a webpage
		driver.get("http://www.google.com/");
		
		((JavascriptExecutor)driver).executeScript("window.open('http://www.facebook.com/', '_blank')");
		ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
		///switching a window
		driver.switchTo().window(tab2.get(1));
		///switching a window
		driver.switchTo().window(tab2.get(0));		
	}

}
