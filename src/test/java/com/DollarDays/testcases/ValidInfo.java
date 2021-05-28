package com.DollarDays.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.DollarDays.pageobjects.SiginPage;

public class ValidInfo extends Baseclass {
	@Test
	public void validcredentials() throws InterruptedException, IOException {
		driver.get(url);
		//invokeSignin( userid, password);
		 SiginPage sp=new SiginPage(driver);
		 logger.info("Navigate to the Browser");
			sp.sigin();
			logger.info("Clicking signin");
			Thread.sleep(2000);
			sp.DDsignin();
			logger.info("Clicking DropDown Signin");
			Thread.sleep(2000);			
		//	sp.username(userid);
			logger.info("username provided");
			Thread.sleep(3000);
		//	sp.password(password);
			logger.info("password provided");
			sp.tosignin();
			logger.info("Clicking Sign in");
			Thread.sleep(3000);

	System.out.println(driver.getTitle());
	String Expected="DollarDays | Bulk Goods for Nonprofits, Businesses & Schools  Wholesale Products";
	
		
		if(driver.getTitle().equals(HomePagetitle))
		{
			Assert.assertTrue(true);
			logger.info("Sigin in  test passed");
		}
		else {
			captureScreen(driver,"SigninTest");
			logger.info("Sign in test failed");
			Assert.assertTrue(false);
		}
		
		/*if(driver.getPageSource().contains("srikanth")==true) {
			Assert.assertTrue(true);
			
			logger.info("SigninTest passed");
			sp.tosignout();
		}
		else {
			Assert.assertTrue(false);
			logger.warn("Signin failed");
		}*/
	}

}


