package com.kenzo.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	
	
	public static WebDriver driver;
	
	public static HomePage hp;
	
	public static RegistrationPage rp;
	
	public PageObjectManager(WebDriver ldriver) {

		this.driver=ldriver;
		
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
