package com.qa.wiki.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.base.TestBase;
import com.qa.wiki.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage hp;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeClass
	public void startbrowser()
	{
		initialization();
		hp = new HomePage();
	}
	
	@Test(priority='1')
	public void titleTest()
	{
		String title = hp.titlePage();
		System.out.println(title);
		Assert.assertEquals(title, "Wikipedia");
	}
	

	@Test(priority='2')
	public void inputTest()
	{
		hp.Enterinput("Selenium Automation");
	}
	
	
	
	
	
	
	

}
