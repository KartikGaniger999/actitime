package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack 
{
@FindBy(linkText ="Tasks")
private WebElement taskbtn;

public EnterTimeTrack(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getTaskbtn() 
{
	return taskbtn;
}






}


