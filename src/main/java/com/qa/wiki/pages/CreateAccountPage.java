package com.qa.wiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wiki.base.TestBase;

public class CreateAccountPage extends TestBase{
	
	@FindBy(xpath="//*[@id='userlogin2']/descendant::input[1]")
	WebElement username;
	
	@FindBy(xpath="//*[@id='userlogin2']/descendant::input[2]")
	WebElement pwd;
	
	@FindBy(xpath="//*[@id='userlogin2']/descendant::input[3]")
	WebElement rtype;
	
	@FindBy(xpath="//*[@id='userlogin2']/descendant::input[4]")
	WebElement eml;
	
	@FindBy(xpath="//*[@id=\"pt-login\"]/a/span")
	WebElement log;
	
	public CreateAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action methods
	
	
	public void createAccount(String name, String password, String retype, String email)
	{
		username.sendKeys(name);
		pwd.sendKeys(password);
		rtype.sendKeys(retype);
		eml.sendKeys(email);
	}
	
	
	public LoginPage clicklogin()
	{
		log.click();
		return new LoginPage();
	}
	
	
	
	
	
	
	
	
	
}
