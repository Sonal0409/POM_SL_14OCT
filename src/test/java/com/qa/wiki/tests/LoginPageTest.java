package com.qa.wiki.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.base.TestBase;
import com.qa.wiki.pages.CreateAccountPage;
import com.qa.wiki.pages.HomePage;
import com.qa.wiki.pages.LoginPage;
import com.qa.wiki.pages.SearchPage;

public class LoginPageTest extends TestBase {
	
	HomePage hp;
	SearchPage sp;
	CreateAccountPage cp;
	LoginPage lp;
	
	public LoginPageTest()
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
		lp = new LoginPage();
		hp.Enterinput("Selenium Automation");
		sp.clicklink();
		cp.createAccount("sonal", "sonal04", "sonal04", "abc@gmail.com");
		cp.clicklogin();
	}

    @Test
	public void loginTest()
	{
	lp.logindetails("sonal04", "sonal04");	
	driver.close();
	}
	
	
	
	
	
	
}
