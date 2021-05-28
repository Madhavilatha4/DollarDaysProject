package com.DollarDays.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
Properties pro;
public Readconfig()  {
	try {
	File src=new File("./configuaration/config.properties");
    FileInputStream input=new FileInputStream(src);
    pro=new Properties();
    pro.load(input);
}catch (Exception e) {
	System.out.println("Exception is "+e.getMessage());
}}
	public String geturl() {
		String url=pro.getProperty("url");
		return url;
	}
	public String getHomePageTitle(){
		String title=pro.getProperty("HomePageTitle");
		return title;
	}
	public String getRegisterPageTitle(){
		String title=pro.getProperty("Registertitle");
		return title;
	}
	
	public String getuserid() {
		String username=pro.getProperty("userid");
		return username;
	}
	
	public String getpassword() {
		String password=pro.getProperty("password");
		return password;
	}

	public String getinvaliduser() {
		String invaliduser=pro.getProperty("invaliduser");
		return invaliduser;
	}
	
	public String getinvalidpassword() {
		String invalidpwd=pro.getProperty("invalidpassword");
		return invalidpwd;
	}
	public String getiteam() {
		String iteam=pro.getProperty("iteam");
		return iteam;
	}
	public String getquantity() {
		String Quant=pro.getProperty("Quatity");
		return Quant;
	}
	
	
	}


