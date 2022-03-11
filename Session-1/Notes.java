package com.simplilearn.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notes {
	public static void main(String[] args) {
		String driver_path="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		////asign base url
		
		String BaseURL="https://facebook.com";
		
		////launch google chrome
		
		driver.get(BaseURL);
		
		WebElement email1=driver.findElement(By.id("email"));
		WebElement email2=driver.findElement(By.name("email"));
		
		System.out.println(email1.equals(email2));
		WebElement email3=driver.findElement(By.className("_6lux"));
		
		System.out.println(email1.equals(email3));
		
		
		///link text
		
	    WebElement link= driver.findElement(By.linkText("Forgotten password?"));
	    link.click();
		
		
		 
		///by using relative path
		 WebElement xpathEmail= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 System.out.println(email1.equals(xpathEmail));
		 
		 
		 // by using full xpath
		WebElement fullXpath=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		System.out.println(email1.equals(fullXpath));
		 
		////selector
		
		WebElement cssSelectorEmail =driver.findElement(By.cssSelector("#email"));/// or input#email
		System.out.println(email1.equals(cssSelectorEmail));
		
		///list of webelements 
		List<WebElement>list=driver.findElements(By.cssSelector("input.inputtext"));
		
		for(WebElement e:list) 
			
			System.out.println(e.getAttribute("placeholder"));
		///TAG AND attribute
		
		WebElement pass=driver.findElement(By.cssSelector("input[name=pass]"));
		System.out.println("Passwrod using Tag: "+pass.getAttribute("placeholder"));
		
		driver.close();
		 
	}

}
