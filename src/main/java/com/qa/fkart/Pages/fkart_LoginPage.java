package com.qa.fkart.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.fkart.Base.fkart_Base;

public class fkart_LoginPage extends fkart_Base{

	// Locate elements 
		// WebElement e =driver.findelement(By.locatorname("value") 
		// Creating a Object repository 
		
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
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[3]/div[1]")
	WebElement popularity;
	//*[@id="container"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[3]/div[1]
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[3]/div[3]")
	WebElement highprice;
	//*[@id="container"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[3]/div[3]
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div/p/a")
	WebElement redmigo;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]")
	WebElement amount;
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement latestproduct;
	@FindBy(xpath="//*[@id=\"pincodeInputId\"]")
	//*[@id="pincodeInputId"]
	WebElement delivery_pincode;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div[1]/div[2]/div/div[2]/div[1]/span")
	WebElement delivery_check;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/span")
	WebElement view_details;
	//  //*[@id="container"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/span
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div/button")
	WebElement close_viewdetails;
	@FindBy(xpath=" //*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	WebElement addtocart;
	
		
	// initialize the elements that are located 
	 // use class PageFactory and method initElements, driver object 
	 	
		
	public fkart_LoginPage()    //this is not a method , it is a constructor
	{
		PageFactory.initElements(driver, this); //driver is coming from Base class and this is used to initialize current Elements
	}
	
	//Action Methods on every element
	
	public void ValidateTitle() 
 	{ 
 		String title= driver.getTitle(); 
 		System.out.println("\n The Title of the Page :" +title); 
 	} 

	
	public void closeLoginModal(String productInput) throws InterruptedException
	{
			//selecting login modal screen	
		    Thread.sleep(2000);
			//System.out.println(lscreen.getText());
			lscreen.click();
			
			System.out.println("\n TestCase#1 - Close the Login Modal Screen ");
	 		System.out.println("\n --------------------------------------------------");
	 		
			//close the login screen
			System.out.println("\n 1.Login Modal Screen Close  " +cbtn.getText());
			cbtn.click();
			  Thread.sleep(3000);
			  
			  //sending text as MI
			emenu.sendKeys(productInput);
			Thread.sleep(2000);
			//Click on Search Btn
			srchbtn.click();
			Thread.sleep(2000);
			
			//click on electronics
			System.out.println("\n 2.Selecting Electronics Menu : " +electronics.getText());
			electronics.click();
			
			Thread.sleep(2000);
			
			WebElement lname=driver.findElement(By.linkText("Mi"));
			System.out.println("\n 3.Selecting Mi Link : " +lname.getText());
			lname.click();
			Thread.sleep(3000);
			
			System.out.println("\n 4.Displaying results of Mi : " +results.getText());
			//results.click();
			Thread.sleep(3000);
			
			System.out.println("\n 5.Selecting Newest Arrivals Menu : " +latest.getText());
			latest.click();
			Thread.sleep(3000);
			
			System.out.println("\n 6.Selecting Popularity Menu : " +popularity.getText());
			popularity.click();
			Thread.sleep(3000);
			
			System.out.println("\n 7.Selecting High-Price Menu : " +highprice.getText());
			highprice.click();
			Thread.sleep(3000);
			
			System.out.println("\n 8.Selecting RedmiGo Menu : " +redmigo.getText());
			redmigo.click();
			Thread.sleep(3000);
			
			
			
			}

}
