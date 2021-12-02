package com.qa.fkart.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.fkart.Base.fkart_Base;

import com.qa.fkart.Pages.fkart_RedmigoPage;

public class fkart_RedmigoPageTest extends fkart_Base {

	fkart_RedmigoPage rp;
	
	@BeforeClass
	public void startBrowser() throws InterruptedException
	{
		initialization();
		rp=new fkart_RedmigoPage();
	}
			
	@Test(priority='1', description="Validating Title Test")
	public void ValidateTitleTest()
	{
		rp.ValidateTitle();
	}
	
	@Parameters({"productInput1"})
	@Test(priority='2', description="Testing RedmiGo Screen")
	public void redmigoTest(String productInput1) throws InterruptedException
	{
		rp.redmigo(productInput1);
	}
	
		
	@AfterClass
	public void closeTest()
	{
		driver.quit();
	}
	



}
