package com.kenzo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public static WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	
	@FindBy(xpath = "//span[@data-gtm-type='toggleEvent']")
	private WebElement login;

	@FindBy(xpath = "(//span[@data-gtm-type='clickEvent'])[126]")
	private WebElement register;
	
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getRegister() {
		return register;
	}
	
}
