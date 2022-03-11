package com.simplilearn.demo;

import java.net.MalformedURLException;
import java.net.URL;

 
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTestDemo {

	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities dr=new DesiredCapabilities();
	       
	        dr.setBrowserName("chrome");
	        dr.setPlatform(Platform.WINDOWS);
	        URL url= new URL("http://192.168.0.108:4444/wd/hub");
	        WebDriver driver=new RemoteWebDriver(url, dr);
	        driver.get("https://www.google.com");
	        System.out.println("My Title: "+driver.getTitle());
	        driver.close();
	}

}
