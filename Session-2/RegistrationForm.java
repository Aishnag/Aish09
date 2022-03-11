package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	public static void main(String[] args) {
		String driver_path="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		WebElement Check= driver.findElement(By.id("id_privacy"));
		
		WebElement Email= driver.findElement(By.id("id_email"));
		Email.sendKeys("nikunj@gmail.com");
		
		WebElement Name= driver.findElement(By.id("id_name"));
		Name.sendKeys("Nikunj Soni");
		
		WebElement Pass= driver.findElement(By.id("id_password"));
		Pass.sendKeys("Nikunj@123");
		
		WebElement Mobile= driver.findElement(By.id("id_cell_phone"));
		Mobile.sendKeys("9876543210");
		
		WebElement Continue= driver.findElement(By.id("registerButton"));
		Continue.click();
		
	
		
	}

}
