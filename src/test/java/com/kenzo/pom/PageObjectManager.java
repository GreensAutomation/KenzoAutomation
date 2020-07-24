package com.kenzo.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	
	
	public static WebDriver driver;
	
	public static HomePage hp;
	
	public static RegistrationPage rp;
	
	public static UserHomePage uh;
	
	public static SelectProduct sp;
	
	public static ProductData pa;
	
	public PageObjectManager(WebDriver ldriver) {

		this.driver=ldriver;
		
	}



	public static WebDriver getDriver() {
		return driver;
	}



	public static UserHomePage getUh() {
		UserHomePage uh = new UserHomePage(driver);
		return uh;
	}



	public static SelectProduct getSp() {
		SelectProduct sp = new SelectProduct(driver);
		return sp;
	}



	public static ProductData getPa() {
		ProductData pa = new ProductData(driver);
		return pa;
	}



	public static HomePage getHp() {
		HomePage hp = new HomePage(driver);
		return hp;
	}


	public static RegistrationPage getRp() {
		RegistrationPage rp = new RegistrationPage(driver);
		return rp;
	}
	
	
	
	

}
