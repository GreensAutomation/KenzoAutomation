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
	
	@FindBy(xpath = "//*[@id=\"headerLoginForm\"]/div[2]")
	private WebElement user;
	

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(id = "pwd")
	private WebElement password;
	
	
	@FindBy(id="loginForm")
	private WebElement loginbutton;
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}


	
	
}
