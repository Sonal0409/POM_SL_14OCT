package com.qa.wiki.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.base.TestBase;
import com.qa.wiki.pages.HomePage;
import com.qa.wiki.pages.SearchPage;

public class SearchPageTest extends TestBase {
	
	HomePage hp;
	SearchPage sp;
	
	public SearchPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void startbrowser()
	{
		initialization();
		hp= new HomePage();
		sp= new SearchPage();
		hp.Enterinput("Selenium Automation");
		
	}
	
	@Test
	public void titleTest()
	{
		sp.pageTitle2();
	}
	
	@Test
	public void clciklinkTest()
	{
		sp.clicklink();
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}











