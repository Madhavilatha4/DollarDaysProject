package com.DollarDays.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.DollarDays.pageobjects.SiginPage;

public class TC_SiginTest extends Baseclass{

	@Test(priority=0)
	public void signinTestTC_DD04() throws Exception {
		driver.get(url);
		SiginPage sp=new SiginPage(driver);
		logger.info("Navigate to the Browser");
		invokeDDsigin();
		sp.tosignin();
		String Actualtitle=driver.getTitle();
		logger.info("Clicking Sign in");
		Thread.sleep(3000);
		System.out.println(Actualtitle);
		System.out.println(Registertitle);
		if(Actualtitle.equals(Registertitle))
		{
			Assert.assertTrue(true);
		captureScreen(driver,"SigninTest");
		logger.info("you entered invalid info");
		logger.info("you are not able to login");
	
			
			
		}
		else {
			logger.info("Sigin in  test passed");
			Assert.assertTrue(false);
		}
	
	}
	
	@Test(priority=1)
	public void SigninTestTC_DD05() throws Exception 
	{
		try
		{  SiginPage sp=new SiginPage(driver);
			invokeSignin(invaliduserid, invalidpswrd);
			String Actual=sp.getAlertmsg();
			String Expected="Incorrect login and password combination.";
			System.out.println(Actual);
		if(Actual.equals(Expected)) 
			{
				Assert.assertTrue(true);
				logger.info("Sigin in  test passed");
			}
			else 
			{
				captureScreen(driver,"SigninTest");
				logger.info("Sign in test failed");
				Assert.assertTrue(false);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		}

}
