package com.mibb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mibb.qa.Base.TestBaseClass;

public class LoginPage extends TestBaseClass
{
//Page factory 
	@FindBy(name="user")
	WebElement user;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[3]/button")
	WebElement LoginBtn;
	
	@FindBy(xpath="//*[@id='signupLiId']/a")
	WebElement SignupBtn;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div/div/a/span/img")
	WebElement Logo;
	

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPageDetail()
	{
		return driver.getTitle();
	}
	
	public boolean ValidateMibbLogo()
	{
		return Logo.isDisplayed();
	}
}
