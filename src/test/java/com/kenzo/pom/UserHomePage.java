package com.kenzo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {

	public static WebDriver driver;

	public UserHomePage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "data-gtm-type=\"clickEvent\"")
	private WebElement men;
	
	@FindBy(xpath = "//*[@id=\"page-category\"]/div[4]/div[3]/div[2]/div[2]/div[2]/div[2]/ul/li[3]/div/div/div/ul/li[1]/ul/li[1]/a/span")
	private WebElement tshirt; 


	public WebElement getMen() {
		return men;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	
	
}
