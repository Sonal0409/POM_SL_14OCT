package com.qa.wiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wiki.base.TestBase;

public class SearchPage extends TestBase {
	
	@FindBy(xpath="//*[@id='p-personal']/descendant::span[5]")
	WebElement linkcreateAccount;
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action methods
	
	public void pageTitle2()
	{
		System.out.println("Title of this page is: "+ driver.getTitle());
	}
	

	public CreateAccountPage  clicklink()
	{
		linkcreateAccount.click();
		return new CreateAccountPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
