package com.qa.wiki.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.base.TestBase;
import com.qa.wiki.pages.CreateAccountPage;
import com.qa.wiki.pages.HomePage;
import com.qa.wiki.pages.SearchPage;

public class CreateAccountPageTest extends TestBase {
	
	HomePage hp;
	SearchPage sp;
	CreateAccountPage cp;
	
	
	public CreateAccountPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void openBrowser()
	{
		initialization();
		hp = new HomePage();
		sp = new SearchPage();
		cp = new CreateAccountPage();
		hp.Enterinput("Selenium Automation");
		
		sp.clicklink();
	}

	@Test
	public void CreateAccountTest()
	{
		cp.createAccount("sonal", "sonal04", "sonal04", "abc@gmail.com");
	}
	
	@Test
	public void loginclickTest()
	{
		cp.clicklogin();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
