package com.qa.fkart.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.fkart.Base.fkart_Base;
import com.qa.fkart.Pages.fkart_LoginPage;
import com.qa.fkart.Pages.fkart_ProductNamePricePage;

public class fkart_ProductNamePricePageTest extends fkart_Base{

	fkart_ProductNamePricePage np;
	
	@BeforeClass
	public void startBrowser() throws InterruptedException
	{
		initialization();
		np=new fkart_ProductNamePricePage();
	}
			
	@Test(priority='1', description="Validating Title Test")
	public void ValidateTitleTest()
	{
		np.ValidateTitle();
	}
	
	@Parameters({"productInput2"})
	@Test(priority='2', description="Testing Product Name Price Screen")
	public void ProductNamePriceTest(String productInput2) throws InterruptedException
	{
		np.ProductNamePrice(productInput2);
	}
	
		
	@AfterClass
	public void closeTest()
	{
		driver.quit();
	}
	


}
