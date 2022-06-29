package com.actitime.generics;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.LoginPage;

public class BaseClass 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public WebDriver driver;
@BeforeClass
public void openBrowser() throws IOException
{
	driver=new ChromeDriver();
	FileLib f=new FileLib();
	String url=f.getProperty("url");
	driver.get(url);
	Reporter.log("openBrowser", true);
}

@AfterClass
public void closeBrowser()
{
	//driver.close();
	Reporter.log("closeBrowser", true);
}

@BeforeMethod
public void login() throws IOException
{
	FileLib fl=new FileLib();
	String un = fl.getProperty("username");
	String pw = fl.getProperty("password");
	
LoginPage lp=new LoginPage(driver);

lp.login(un, pw);
}


}
