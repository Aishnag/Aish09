package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {
	public static void main(String[] args) {
		
		////https://nxtgenaiacademy.com/alertandpopup/
		
		String driver_path="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.findElement(By.name("alertbox")).click();
		driver.switchTo().alert().accept();
		
		
		//System.out.println(driver.findElement(By.id("demo")).getText());
		
		
		driver.findElement(By.name("confirmalertbox")).click();
		driver.switchTo().alert().accept();
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		
		driver.findElement(By.name("promptalertbox1234")).click();
		driver.switchTo().alert().sendKeys("yes");
		driver.switchTo().alert().accept();
		
		System.out.println(driver.findElement(By.id("demoone")).getText());
		
	    driver.close();
		
		
		
		
	}

}
