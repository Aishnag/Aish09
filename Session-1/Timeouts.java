package com.simplilearn.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeouts {
	
	public static void main(String[] args) {
		String driver_path="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver =new ChromeDriver();		
		driver.get("https://facebook.com");
		
		///Implcit wait timeout for 20seconds
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		///scripted timeout
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		///page loadtimeout
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebElement email1=driver.findElement(By.id("email"));
		email1.sendKeys("test@xyz.com");
		
		driver.close();
	}

}
