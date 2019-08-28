package com.acti.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.acti.qa.base.DriverScript;

public class TasksTab extends DriverScript {
	
	//Page Elements
	@FindBy (xpath="//div[contains( text(),'TASKS')]") WebElement tasksTab;
	@FindBy (xpath="//div[contains( text(), 'Add New')]") WebElement addNewBtn;
	@FindBy (xpath= "//div[contains( text(), '+ New Customer')]") WebElement addNewCutomerOption;
	@FindBy (xpath= "//input[@placeholder='Enter Customer Name'][@type='text'][@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement enterCustomerNametb;
	@FindBy (xpath= "//textarea[@placeholder='Enter Customer Description']") WebElement enterCusDescriptiontextArea;
	@FindBy (xpath="//div[contains( text(),'Create Customer')]") WebElement createCustomerBtn;
	
	//global variable	
	String custname;
	
	//PageInitialization
		//Create Constructor of TasksTab Class
		public TasksTab()
		{
			PageFactory.initElements(driver, this);
		}
		
	//Page Actions/Methods
		public void taskTabClick()
		{
			tasksTab.click();
		}
		public void addNewBtnClick()
		{
			addNewBtn.click();			
		}
		public void addNewCustomerCreateClick()
		{
			addNewCutomerOption.click();			
		}
		
		public String enterCustomerName(String custname, String description)
		{
			enterCustomerNametb.sendKeys(custname);
			enterCusDescriptiontextArea.sendKeys(description);
			createCustomerBtn.click();
			return custname;
		}
		
		public void verifyDisplayOfCustName()
		
		{
			String actualTitle=driver.getTitle();
			if (actualTitle.contentEquals(custname))
			{
				System.out.println("Test Passed: Page Title Matches Customer's name " + custname);
			}
			else
			{
				System.out.println("Test Failed: Page Title does not match Customer's name " + custname);
			}
		}
			
			
			
		
}
