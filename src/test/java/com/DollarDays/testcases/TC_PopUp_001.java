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
<<<<<<< HEAD
		Thread.sleep(1000);
		String Expected= "No quantity of products given to order.";
		System.out.println(Actual);
		Assert.assertEquals(Expected, Actual,"Test Fail");
		Thread.sleep(1000);
=======
		thread.sleep(1000);
		String Expected= "No quantity of products given to order.";
		System.out.println(Actual);
		Assert.assertEquals(Expected, Actual,"Test Fail");
		thread.sleep(1000);
>>>>>>> 300276e11d36bf8b5aea5f02c2e984be0c90f7d7
		logger.info("Test pass");
	}
}
