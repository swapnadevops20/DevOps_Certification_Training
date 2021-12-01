package com.qa.fkart.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.fkart.Base.fkart_Base;
import com.qa.fkart.Pages.fkart_ProductAddToCartPage;


public class fkart_ProductAddToCartPageTest extends fkart_Base {

	

fkart_ProductAddToCartPage pp;
	
	@BeforeClass
	public void startBrowser() throws InterruptedException
	{
		initialization();
		pp=new fkart_ProductAddToCartPage();
	}
			
	@Test(priority='1', description="Validating Title Test")
	public void ValidateTitleTest()
	{
		pp.ValidateTitle();
	}
	
	@Parameters({"productInput3","pincodeInput"})
	//@Parameters({"productInput3"})
	@Test(priority='2', description="Selected Product is Added to Cart")
	public void AddToCartTest(String productInput3,String pincodeInput) throws InterruptedException
	{
		pp.AddToCart(productInput3,pincodeInput);
	}
	
		
	@AfterClass
	public void closeTest()
	{
		driver.quit();
	}
	




}
