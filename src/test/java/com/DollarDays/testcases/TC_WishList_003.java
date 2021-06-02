package com.DollarDays.testcases;

import org.testng.annotations.*;

public class TC_WishList_003 extends Baseclass {

	@Test
	public void wishlistTest() throws InterruptedException 
	{ 
		driver.manage().window().maximize();
		invokeWishlist();
		Thread.sleep(1000);
		if(isAlertPresent()==true) 
		{Thread.sleep(1000);
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
		{Thread.sleep(1000);
			driver.switchTo().alert();
			return true;
		}catch (Exception e) {

			return false;
		}

	}
	
}
