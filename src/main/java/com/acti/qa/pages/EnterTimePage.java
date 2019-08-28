package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.DriverScript;

public class EnterTimePage extends DriverScript{
	
	//Page Elements
	@FindBy (xpath="//div[contains( text(),'TIME-TRACK')]") WebElement timeTrackTab;
	@FindBy (xpath="//div[contains( text(),'TASKS')]") WebElement tasksTab;
	@FindBy (xpath="//div[contains( text(),'REPORTS')]") WebElement reportsTab;
	@FindBy (xpath="//div[contains( text(),'USERS')]") WebElement usersTab;
	@FindBy (xpath ="//a[@class='userProfileLink username']") WebElement userProfileLink;
	@FindBy (id="logoutLink") WebElement logOutBtn;
	
	
	//Initialize Page Elements
	public EnterTimePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Page Actions/Methods	
	public boolean timeTrackTabDisplayed()
	{
		return timeTrackTab.isDisplayed();
	}
	
	public void clicktimeTrackMenu()
	{
		 timeTrackTab.click();
	}
	
	public boolean tasksTabDisplayed()
	{
		return tasksTab.isDisplayed();
	}
	
	public void clicktasksMenu()
	{
		tasksTab.click();
	}
	
	public boolean reportsTabDisplayed()
	{
		return reportsTab.isDisplayed();
	}
	
	public void clickreportsMenu()
	{
		reportsTab.click();
	}
	
	public void loginUserNameDisplayed()
	{
		String actual = "John Doe";
		String result= userProfileLink.getText();
		if (result == actual)
		{
			System.out.println("Login User Name is CORRECT"+ actual);
		}
		else
		{
			System.out.println("Login User Name is INCORRECT" + result);
		}
	}
		
	public void clicklogOut()
	{
		logOutBtn.click();
	}
	
	

	

}
