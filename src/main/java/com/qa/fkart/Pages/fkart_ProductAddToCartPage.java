package com.qa.fkart.Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.fkart.Base.fkart_Base;

public class fkart_ProductAddToCartPage extends fkart_Base {
	
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
			
			
			@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[3]/div[4]")
			WebElement latest;
			//*[@id="container"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[3]/div[4]
			@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
			WebElement latestproduct;
			
			@FindBy(xpath="//*[@id=\"pincodeInputId\"]")
			//*[@id="pincodeInputId"]
			WebElement delivery_pincode;
			
			//*[@id="container"]/div/div[3]/div[1]/div[2]/div[6]/div/div/div[1]/div[2]/div/div[2]/div[1]/span
			@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[6]/div/div/div[1]/div[2]/div/div[2]/div[1]/span")
			WebElement delivery_check;
			@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[6]/div/div/div[2]/div[2]/span")
			WebElement view_details;
			//  //*[@id="container"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/span
			@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div/button")
			WebElement close_viewdetails;
			@FindBy(xpath=" //*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
			WebElement addtocart;
			
				
			// initialize the elements that are located 
			 // use class PageFactory and method initElements, driver object 
			 	
				
			public fkart_ProductAddToCartPage()    //this is not a method , it is a constructor
			{
				PageFactory.initElements(driver, this); //driver is coming from Base class and this is used to initialize current Elements
			}
			
			//Action Methods on every element
			
			public void ValidateTitle() 
		 	{ 
		 		String title= driver.getTitle(); 
		 		System.out.println("\n" +title); 
		 	} 

			
			public void AddToCart(String productInput3,String pincodeInput) throws InterruptedException
			{
					//selecting login modal screen	
				    Thread.sleep(2000);
					lscreen.click();
					
					//close the login screen
					cbtn.click();
					  Thread.sleep(3000);
					  
					  //sending text as MI
					emenu.sendKeys(productInput3);
					Thread.sleep(2000);
					//Click on Search Btn
					srchbtn.click();
					Thread.sleep(2000);
					
					//click on electronics
					
					electronics.click();
					System.out.println("\n TestCase#4 - Selected Newest Product  is ADDED TO CART PAGE");
					System.out.println("\n -----------------------------------------------------------------");
					Thread.sleep(2000);
					
					WebElement lname=driver.findElement(By.linkText("Mi"));
					System.out.println("\n 1.Selecting Mi Link : " +lname.getText());
					lname.click();
					Thread.sleep(3000);
					
					System.out.println("\n 2.Selecting Newest Arrivals Menu : " +latest.getText());
					latest.click();
					Thread.sleep(3000);
					latestproduct.click();
					Thread.sleep(3000);
					
		//navigating to next tab			
		ArrayList<String> tabs=	new ArrayList<String> (driver.getWindowHandles());
					  
					 	//Navigating to 2nd tab ie 1st index
					driver.switchTo().window(tabs.get(1));
					Thread.sleep(2000);
					driver.switchTo().window(tabs.get(0));
					Thread.sleep(2000);
					driver.switchTo().window(tabs.get(1));
					Thread.sleep(5000);
					
					
					  System.out.println("\n 3.Entering Delivery Pincode : 516360" );
					  delivery_pincode.clear(); Thread.sleep(3000);
					  delivery_pincode.sendKeys(pincodeInput);
					 
					
					
					  Thread.sleep(3000); System.out.println("\n 4.Click on Check button : "
					  +delivery_check.getText()); delivery_check.click(); Thread.sleep(3000);
					 
					System.out.println("\n 5.Click on View Details of the product : " +view_details.getText());
					view_details.click();
					Thread.sleep(3000);
					
					System.out.println("\n 6.Close the view details  " +close_viewdetails.getText());
					close_viewdetails.click();
					Thread.sleep(3000);
					
					System.out.println("\n 7.Click on ADD TO CART : " +addtocart.getText() +"\n");
					addtocart.click();
					Thread.sleep(3000);
					
						
			}

}
