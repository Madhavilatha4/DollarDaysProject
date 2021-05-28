package com.DollarDays.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.DollarDays.pageobjects.SiginPage;
import com.DollarDays.utilites.ExcelUtils;


public class TC_SigninDDT extends Baseclass 
{	
	@Test(priority=1,dataProvider = "Sign in")
	public void SigninTC_DD04(String user,String paswrd) throws Exception 
	{
		try
		{
			invokeSignin(user, paswrd);

			String ActualTitle=driver.getTitle();
			if(ActualTitle.equals(HomePagetitle)) 
			{
				Assert.assertTrue(true);
				logger.info("Successfully login");
				invokeSignout();
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
		@Test(priority=0)
		public void SigninTC_DD05() throws InterruptedException, IOException
		{
		SiginPage sp=new SiginPage(driver);
		logger.info("Navigate to the Browser");
		invokeDDsigin();
		sp.tosignin();
		String Actualtitle=driver.getTitle();
		logger.info("Clicking Sign in");
		Thread.sleep(3000);
		System.out.println("actual is"+Actualtitle);
		System.out.println("title is the config. file"+Registertitle);
		if(driver.getTitle().equals(Registertitle))
		{
			Assert.assertTrue(true);
			logger.info("Sigin in  test passed");
		}
		else {
			captureScreen(driver,"SigninTest");
			logger.info("Sign in test failed");
			Assert.assertTrue(false);
		}
		
	}			
	@DataProvider(name="Signin")
	public  Object[][] getdata() throws Exception{
		String path=System.getProperty("user.dir")+"/src/test/java/com/DollarDays/testdata/SigninData.xlsx";

		int rownum=ExcelUtils.getRowCount(path, "Sheet1");
		System.out.println("no.of rows"+rownum);

		int cellnum=ExcelUtils.getCellcount(path, "Sheet1", 1);
		System.out.println("no.of cells"+cellnum);

		Object logindata[][]=new String[rownum][cellnum];
		for(int i=1;i<=rownum;i++) 
		{
			for (int j=0;j<cellnum;j++) 
			{
				logindata[i-1][j]=ExcelUtils.getcellData(path, "Sheet1",i,j);
			}	
		}
		return logindata;
	}

}

/*	Assert.assertEquals(ActualTitle,HomePageTitle,"you are at Register Page");

logger.info("Successfully login");

sp.setContainimage();
sp.signout.click();
logger.info(" you are signout");
Assert.assertEquals(ActualTitle, HomePageTitle);
logger.info("your test passed");*/

