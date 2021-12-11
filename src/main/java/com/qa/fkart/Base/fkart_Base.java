package com.qa.fkart.Base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class fkart_Base {
	
public static WebDriver driver;

	
	public static void initialization() throws InterruptedException
	{
		
		
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		/*ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");

		chromeOptions.setExperimentalOption("useAutomationExtension", false);*/
				 
		driver = new ChromeDriver();
				  
		driver.get("https://www.flipkart.com/");
				
		/*driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		*/
		//pageload wait time
				driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			
	
		//Implicit wait for five seconds
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
			}
		
}
