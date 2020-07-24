package com.kenzo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct {

	public static WebDriver driver;
	
	public SelectProduct(WebDriver ldriver) 
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"FA65TS0204YA.73.L\"]/a/div[1]")
	private WebElement timg;
	
	public WebElement getTimg() {
		return timg;
	}
	
	
	
}
