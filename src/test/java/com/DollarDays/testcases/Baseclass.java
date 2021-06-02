package com.DollarDays.testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.DollarDays.pageobjects.SiginPage;
import com.DollarDays.pageobjects.WishListPage;
import com.DollarDays.utilites.Readconfig;

public class Baseclass {
	Readconfig read=new Readconfig();
	public String url=read.geturl();
	public String userid=read.getuserid();
	public String password=read.getpassword();
	 public String HomePagetitle=read.getHomePageTitle();
   public  String Registertitle=read.getRegisterPageTitle();
   public String item=read.getiteam();
	public static WebDriver driver=null;
	public String Quantity=read.getquantity();
	public String invaliduserid=read.getinvaliduser();
	public String invalidpswrd=read.getinvalidpassword();
	public Logger logger;
	

	@Parameters("browser")
	@BeforeMethod
	public void setUp(@Optional("chrome")String browser) {
		logger =LogManager.getLogger(Baseclass.class);
		if(browser.equals("edge")){
			System.out.println("Open Edge Driver");
			logger.info("Open Edge Browser");
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(browser.equals("chrome")){
			System.out.println("Open Chrome Driver");
			logger.info("Open Chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}


		logger.info("Opening the Browser");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
		@AfterMethod
		public void Teardown() {
		logger.info("Closing the Browser");

		driver.quit();
	}
	
	
	
	public static void captureScreen(WebDriver driver,String tname) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname +dateName+".png");

		FileUtils.copyFile(source, target.getAbsoluteFile());
		System.out.println("Screenshot taken");

	}    

	public void invokeSignin(String user,String paswrd) throws InterruptedException {
		logger.info("Navigate to the Browser");
		SiginPage sp=new SiginPage(driver);
		sp.sigin();
		logger.info("Clicking signin");
		Thread.sleep(1000);
		sp.DDsignin();
		logger.info("Clicking DropDown Signin");
		sp.username(user);
		logger.info("username provided");
		sp.password(paswrd);
		Thread.sleep(1000);
		logger.info("password provided");
		sp.tosignin();
		logger.info("Clicking Sign in");
		Thread.sleep(3000);

	}
	public void invokeSignout() 
	{
		SiginPage sp=new SiginPage(driver);
		sp.setContainimage();
	    sp.signout.click();
		logger.info(" you are signout");
	}
	public  void invokeDDsigin()
	{
		SiginPage sp=new SiginPage(driver);
		logger.info("Navigate to the Browser");
		sp.sigin();
		logger.info("Clicking signin");
		sp.DDsignin();
		logger.info("Clicking DropDown Signin");
	}
	 
	public void  invokeWishlist() 
	{
		WishListPage wp=new WishListPage(driver);
		
		wp.ClickWishlist();
		logger.info("clicking wishlist icon");
		wp.ClickLearnmore();
		logger.info("clicking Learnmore icon");
		wp.Clicksearch();
		logger.info("clicking search button");
		
	}
	public void Searchitem() throws InterruptedException {
		SiginPage sp=new SiginPage(driver);
		
	sp.setsearchitem(item);
	logger.info("Enter item name in searchbox");
	sp.setsearchbutton();
	logger.info("click searchbutton");
	sp.Clickiteam();
	Thread.sleep(1000);
	logger.info("Clicking the image");
	Thread.sleep(1000);
	sp.value.clear();
	Thread.sleep(1000);
	sp.setvalue("121313914424905357375366935");
	logger.info("Enter no.of Quantity");
	Thread.sleep(2000);
	sp.setaddtocart();
	logger.info("Click addtocart");
	Thread.sleep(1000);
	
	}

}
