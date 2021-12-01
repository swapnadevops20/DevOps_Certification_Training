package com.qa.fkart.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fkart_Base {
	
public static WebDriver driver;

	
	public static void initialization() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		
		//pageload wait time
				driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			
	
		//Implicit wait for five seconds
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			}
		
}
