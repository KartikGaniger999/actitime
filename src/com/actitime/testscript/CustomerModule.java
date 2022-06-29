package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.EnterTimeTrack;

public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("create customer", true);
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.getTaskbtn().click();
	}
	

}
