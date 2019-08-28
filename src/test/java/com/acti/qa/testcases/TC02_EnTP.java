package com.acti.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.qa.base.DriverScript;
import com.acti.qa.pages.EnterTimePage;
import com.acti.qa.pages.LoginPage;

public class TC02_EnTP extends DriverScript {
	
	//global variables
	EnterTimePage etp;
	LoginPage lp;
	
	//Constructor of the class-- to invoke parent class contructor
	public TC02_EnTP()
	{
		super();
	}

	@BeforeMethod
	public void preTest()
	{
		initBrowser();
		etp = new EnterTimePage();
		lp= new LoginPage();	
		
	}
	@Test
	public void testVerifyTaskMenu()
	{
		lp.loginToApp(prop.getProperty("username"), prop.getProperty("password"));
		boolean flag=etp.timeTrackTabDisplayed();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
