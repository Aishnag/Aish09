package com.simplilearn.demo;

import java.awt.RenderingHints.Key;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {
	public static void main(String[] args) {
		
		String driver_path="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
		WebElement Username= driver.findElement(By.id("email"));
		
		Actions builder =new Actions(driver);
		org.openqa.selenium.interactions.Action seriesOfAction = builder
				.moveToElement(Username)
				.click()
				.keyDown(Username,Keys.SHIFT)
				.sendKeys(Username,"hello")
				.keyUp(Username,Keys.SHIFT)
				.doubleClick(Username)
				.contextClick()
				.build();
				
		seriesOfAction.perform();
	}

}
