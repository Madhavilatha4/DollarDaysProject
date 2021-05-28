package com.DollarDays.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WishListPage 
{
	static WebDriver ldriver;

	 public WishListPage(WebDriver rdriver){
		ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	 }

	@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]/img[1]")
	public WebElement wishlist;
	public void ClickWishlist() 
	{   

		wishlist.click();
	}
	@FindBy(linkText="Learn More")
	public WebElement Learnmore;
	public void ClickLearnmore() 
	{
		Learnmore.click();
	}
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement wishlistname;
	public void Enterwishlistname(String email) 
	{
		wishlistname.sendKeys(email);
	}
	@FindBy(xpath="//body/div[3]/div[1]/div[1]/div[3]/div[1]/input[1]")
	public WebElement city;
	public void Entercity(String cityname) 
	{
		city.sendKeys(cityname);

	}
	@FindBy(xpath="//button[contains(text(),'SEARCH')]")
	public WebElement search;
	public  void Clicksearch() 
	{
		search.click();
	}
}
