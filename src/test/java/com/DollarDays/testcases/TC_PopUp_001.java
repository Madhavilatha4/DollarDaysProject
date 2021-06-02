package com.DollarDays.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.DollarDays.pageobjects.SiginPage;

public class TC_PopUp_001 extends Baseclass {
	@Test
	public void popuptest() throws InterruptedException {
		driver.manage().window().maximize();
		SiginPage sp=new SiginPage(driver);
		invokeSignin(userid,password);
		Searchitem();
		
		String Actual=sp.setAlertmsg();

		Thread.sleep(1000);
		String Expected= "No quantity of products given to order.";
		System.out.println(Actual);
		Assert.assertEquals(Expected, Actual,"Test Fail");
		Thread.sleep(1000);

		System.out.println(Actual);
		Assert.assertEquals(Expected, Actual,"Test Fail");

		logger.info("Test pass");
	}
}
