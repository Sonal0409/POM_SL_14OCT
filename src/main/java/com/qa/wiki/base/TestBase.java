package com.qa.wiki.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase()
	{
	
		FileInputStream file = null;
	
	try {
		file = new FileInputStream("C:\\Users\\sonal\\eclipse-workspace\\POM_FrameworkSL_14Oct\\src\\main\\java\\com\\qa\\wiki\\config\\config.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	prop = new Properties();
	
	try {
		prop.load(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
	public static void initialization()
	{
		String browsername= prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("FF"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String urlname = prop.getProperty("url") ;
		driver.get(urlname);
		
	}

}
