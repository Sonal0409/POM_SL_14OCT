package com.qa.wiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wiki.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath="//*[@name='userlogin']/descendant::input[1]")
    WebElement uname;
	
	@FindBy(xpath="//*[@name='userlogin']/descendant::input[2]")
	WebElement pwd;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logindetails(String name , String password)
	{
		uname.sendKeys(name);
		pwd.sendKeys(password);
	}
	
	
}











