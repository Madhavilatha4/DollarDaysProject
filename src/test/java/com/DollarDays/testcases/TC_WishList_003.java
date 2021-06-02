package com.DollarDays.testcases;

import org.testng.annotations.*;

public class TC_WishList_003 extends Baseclass {

	@Test
	public void wishlistTest() throws InterruptedException 
<<<<<<< HEAD
	{ 
=======
	{
>>>>>>> 300276e11d36bf8b5aea5f02c2e984be0c90f7d7
		driver.manage().window().maximize();
		invokeWishlist();
		Thread.sleep(1000);
		if(isAlertPresent()==true) 
<<<<<<< HEAD
		{Thread.sleep(1000);
=======
		{
			thread.sleep(1000);
>>>>>>> 300276e11d36bf8b5aea5f02c2e984be0c90f7d7
			driver.switchTo().alert().accept();//close Alert
			logger.warn("Provide wishList name");
			logger.info("Test pass");

		}
		else {
			logger.info("Test fail");
		}
	}

	public boolean isAlertPresent() 
	{
		try
<<<<<<< HEAD
		{Thread.sleep(1000);
=======
		{
			thread.sleep(1000);
>>>>>>> 300276e11d36bf8b5aea5f02c2e984be0c90f7d7
			driver.switchTo().alert();
			return true;
		}catch (Exception e) {

			return false;
		}

	}
	
}
