package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.DriverScript;

public class LoginPage extends DriverScript {
	//Page Elements
	@FindBy (xpath="//div [@class='atLogoImg']")  WebElement actiLogo;
	@FindBy (id="username") WebElement userNameTb;
	@FindBy (name="pwd") WebElement passwordTb;
	@FindBy (id="loginButton") WebElement loginBtn;
	
	//PageInitialization
	//Create Constructor of LoginPage Class
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Page Actions/Methods
	public void logoDisplayedPrint()
	{
		boolean result = actiLogo.isDisplayed();
		if(result == true)
		{
		System.out.println("ActiLogo is displayed");
		}
		else
		{
			System.out.println("ActiLogo is NOT displayed");
		}
	}
	public boolean logoDisplayed()
	{
		return actiLogo.isDisplayed();
	}
	 
	public void loginToApp(String username, String password)
	{
		userNameTb.sendKeys(username);
		passwordTb.sendKeys(password);
		loginBtn.click();
	}

}
