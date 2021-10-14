package com.qa.wiki.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wiki.base.TestBase;

public class HomePage extends TestBase{
	
	// Object Repository: list of objects/webelements we wnat to do testing on
	
	@FindBy(xpath="//*[@id='search-form']/descendant::input[3]")
	WebElement searchinput;
	
	
	@FindBy(xpath="//*[@id='search-form']/descendant::button[1]")
	WebElement searchbutton;
	
	// PageFactory:  initElements
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// Actions on the elements
	// Action Methods
	
	public String titlePage()
	{
		return driver.getTitle();
	}
	
	public SearchPage Enterinput(String searchInput)
	{
		searchinput.sendKeys(searchInput);
	    searchbutton.click();
	    return new SearchPage();
	}
	
	
	
	
	
	

}
