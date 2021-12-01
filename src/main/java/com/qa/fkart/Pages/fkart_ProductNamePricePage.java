package com.qa.fkart.Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.fkart.Base.fkart_Base;

public class fkart_ProductNamePricePage extends fkart_Base{
	

	@FindBy(xpath="/html/body/div[2]/div/div/div/div")
	WebElement lscreen;
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement cbtn;
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement emenu;
	@FindBy(xpath="//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	WebElement srchbtn;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/span[1]")
	WebElement electronics;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/span")
	WebElement results;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[3]/div[4]")
	WebElement latest;
	//*[@id="container"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[3]/div[4]
	
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement latestproduct;
	
	
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span")
	//*[@id="pincodeInputId"]
	WebElement productname;
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div[1]")
	WebElement amount1;
	
		
	// initialize the elements that are located 
	 // use class PageFactory and method initElements, driver object 
	 	
		
	public fkart_ProductNamePricePage()    //this is not a method , it is a constructor
	{
		PageFactory.initElements(driver, this); //driver is coming from Base class and this is used to initialize current Elements
	}
	
	//Action Methods on every element
	
	public void ValidateTitle() 
 	{ 
 		String title= driver.getTitle(); 
 		System.out.println("\n The Title of the Page :" +title); 
 	} 

	
	public void ProductNamePrice(String productInput2) throws InterruptedException
	{
			//selecting login modal screen	
		    Thread.sleep(2000);
			//System.out.println(lscreen.getText());
			lscreen.click();
			
			System.out.println("\n TestCase#3 - Product Name and Price Screen ");
	 		System.out.println("\n --------------------------------------------------");
	 		
			//close the login screen
			//System.out.println("\n 1.Login Modal Screen Close  " +cbtn.getText());
			cbtn.click();
			  Thread.sleep(3000);
			  
			  //sending text as MI
			emenu.sendKeys(productInput2);
			Thread.sleep(2000);
			//Click on Search Btn
			srchbtn.click();
			Thread.sleep(2000);
			
			//click on electronics
			//System.out.println("\n 2.Selecting Electronics Menu : " +electronics.getText());
			electronics.click();
			
			Thread.sleep(2000);
			
			WebElement lname=driver.findElement(By.linkText("Mi"));
			System.out.println("\n 1.Selecting Mi Link : " +lname.getText());
			lname.click();
			Thread.sleep(3000);
			
			System.out.println("\n 2.Displaying results of Mi : " +results.getText());
			//results.click();
			Thread.sleep(3000);
			
			System.out.println("\n 3.Selecting Newest Arrivals Menu : " +latest.getText());
			latest.click();
			Thread.sleep(3000);
					
			System.out.println("\n 4.Selecting First Product : " +latestproduct.getText());
			latestproduct.click();
			Thread.sleep(3000);
			
			ArrayList<String> tabs=	new ArrayList<String> (driver.getWindowHandles());
			  
			  	//Navigating to 2nd tab ie 1st index
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(2000);
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(2000);
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(2000);
	
			System.out.println("\n 5.Displaying First Product Name : " +productname.getText());
			//latestproduct.click();
			Thread.sleep(3000);
			
			System.out.println("\n 6.Displaying First Product Amount : " +amount1.getText());
			//latestproduct.click();
			Thread.sleep(3000);
	}		


}
