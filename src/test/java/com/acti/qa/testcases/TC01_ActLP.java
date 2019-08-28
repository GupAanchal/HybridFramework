package com.acti.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.qa.base.DriverScript;
import com.acti.qa.pages.LoginPage;

public class TC01_ActLP extends DriverScript{
	
	//global variables
	LoginPage lp;
	
	//Create constructor of this class
	public TC01_ActLP()
	{
		super(); //invoke parent class constructor.
	}
	
	@BeforeMethod
	public void preTest()
	{
		initBrowser();
		lp = new LoginPage();
		
	}
	
	/*@Test (priority = 1)
	public void testVerifyActiLog()
	{
		boolean flag = lp.logoDisplayed();
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}*/
	
	@Test 
	public void testValidateLogin() throws Exception 
	{
		lp.loginToApp("admin","manager");
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Enter"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	

}
