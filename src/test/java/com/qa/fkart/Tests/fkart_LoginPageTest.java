package com.qa.fkart.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.fkart.Base.fkart_Base;
import com.qa.fkart.Pages.fkart_LoginPage;


public class fkart_LoginPageTest extends fkart_Base{
	
	
	fkart_LoginPage fp;
	
	@BeforeClass
	public void startBrowser() throws InterruptedException
	{
		initialization();
		fp=new fkart_LoginPage();
	}
			
	@Test(priority='1', description="Validating Title Test")
	public void ValidateTitleTest()
	{
		fp.ValidateTitle();
	}
	
	
	@Parameters({"productInput"})
	@Test(priority='2', description="Closing LoginModal Screen")
	public void closeLoginTest(String productInput) throws InterruptedException
	{
		fp.closeLoginModal(productInput);
	}
	
		
	@AfterClass
	public void closeTest()
	{
		driver.quit();
	}
	


}
