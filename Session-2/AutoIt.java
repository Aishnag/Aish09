package com.simplilearn.demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
	public static void main(String[] args) throws IOException,InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\Simpli Learn\\extra\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shine.com/registration/");

		driver.findElement(By.id("id_name")).sendKeys("nikunj");
		
		WebElement element = driver.findElement(By.id("id_file"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", element);
		 
	     Thread.sleep(5000);
	     Runtime.getRuntime().exec("D:\\Screenshot\\FileUpload1.exe");

		//driver.close();
		
	}

}
