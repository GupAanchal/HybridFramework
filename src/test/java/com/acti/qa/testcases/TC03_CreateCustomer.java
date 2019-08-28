package com.acti.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.qa.base.DriverScript;
import com.acti.qa.pages.EnterTimePage;
import com.acti.qa.pages.LoginPage;
import com.acti.qa.pages.TasksTab;

public class TC03_CreateCustomer extends DriverScript {
	
	//global variables
		EnterTimePage etp;
		LoginPage lp;
		TasksTab tt;
		
		//Constructor of the class-- to invoke parent class constructor
		public TC03_CreateCustomer()
		{
			super();
		}

		@BeforeMethod
		public void preTest()
		{
			initBrowser();
			etp = new EnterTimePage();
			lp= new LoginPage();	
			tt = new TasksTab();
		}
		@Test
		public void createCustomer()
		{
			lp.loginToApp(prop.getProperty("username"), prop.getProperty("password"));
			boolean flag=etp.tasksTabDisplayed();
			Assert.assertTrue(flag);
			
			tt.taskTabClick();
			tt.addNewBtnClick();
			tt.addNewCustomerCreateClick();
			tt.enterCustomerName("Anchal Gupta", " Lets' create customer");
			tt.verifyDisplayOfCustName();
			
			
		}
		
		
		@AfterMethod
		public void tearDown()
		{
			driver.close();
		}
				

}
