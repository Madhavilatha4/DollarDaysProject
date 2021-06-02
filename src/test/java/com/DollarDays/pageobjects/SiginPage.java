package com.DollarDays.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SiginPage {
	static WebDriver ldriver;

	public SiginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/img")
	@CacheLookup
	public WebElement sigin;
	public void sigin() {
		sigin.click();
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/ul/li[2]/a")
	public  WebElement DDsignin;
	public void DDsignin() {
		DDsignin.click();
	}
	@FindBy(xpath ="//*[@id=\'inputLoginUsername\']")
	@CacheLookup
	public WebElement username;
	public void username(String uname) {
		username.sendKeys(uname); 
	}
	@FindBy(how=How.NAME,using ="password")
	@CacheLookup
	public WebElement password;
	public void password(String pwd) {
		password.sendKeys(pwd); 
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"aspnetForm\"]/div[5]/div/div/div/div[2]/div/div[1]/div/div/div[4]/button")
	@CacheLookup
	public  WebElement tosiginin;
	public void tosignin()
	{
		tosiginin.click();
	}
	@FindBy(xpath="//body[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public WebElement Alertmessage;
	public String getAlertmsg() {
		String msg=Alertmessage.getText();
		return msg;
	}

	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	public WebElement signout;
	public void  tosignout() 
	{
		signout.click();
	}


	@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]")
	public WebElement Containimage;
	public void setContainimage()
	{
		Containimage.click();
	}
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div/div/div/div[1]/div/div/div/strong")
	public WebElement Alert;
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div/div/div/div[1]/div/div/div/a")
	public WebElement xmark;
	public void Xmark()
	{
		xmark.click();
	}
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement textbox_search;
	public void setsearchitem(String item) {
		textbox_search.sendKeys(item);
	}
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement searchbutton;
	public void setsearchbutton() {
		searchbutton.sendKeys(Keys.RETURN);
	}
	@FindBy(partialLinkText="Premium Face Mask wi")
	WebElement nameofiteam;
	public void Clickiteam() {
		nameofiteam.sendKeys(Keys.ENTER);	
	}
	@FindBy(xpath="/html[1]/body[1]/form[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	 public WebElement value;
	public void setvalue(String number) {
		value.sendKeys(number);
	}
	@FindBy(xpath="//button[contains(text(),'Add to cart')]")
	WebElement addtocart;
	public void setaddtocart() {
		addtocart.sendKeys(Keys.RETURN);
	}
	@FindBy(xpath="//div[contains(text(),'No quantity of products given to order.')]")
	WebElement Alertmsg;
	public String setAlertmsg() {
		String msg=Alertmsg.getText();
		return msg;
	}

}