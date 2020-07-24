package com.kenzo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductData {

	public static WebDriver driver;
	
	public ProductData(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@style='background-color: #000000']")
	private WebElement color;
	
	@FindBy(xpath = "//*[@id=\"content\"]/section/div/div[1]/div[2]/div/div[3]/span")
	private WebElement size;
	
	@FindBy(xpath = "//span[@title='M']")
	private WebElement sizemed;
	
	@FindBy(xpath = "//button[@data-datalayer='addToCartFP']")
	private WebElement addcart;
	

	public WebElement getColor() {
		return color;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getSizemed() {
		return sizemed;
	}

	public WebElement getAddcart() {
		return addcart;
	}
	
}
