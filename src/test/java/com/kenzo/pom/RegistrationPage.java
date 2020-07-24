package com.kenzo.pom;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	public static WebDriver driver;
	
	public RegistrationPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@title='Accept Cookies']")
	private WebElement cok;
	
	@FindBy(xpath = "//label[@for='mr']")
	private WebElement gender;

	@FindBy(id = "firstname")
	private WebElement fname;
	
	@FindBy(id = "lastname")
	private WebElement name;
	
	@FindBy(id="register_email")
	private WebElement email;
	
	@FindBy(id = "nl-women")
	private WebElement tc;
	
	@FindBy(id="register_password")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/section/div/div/form/div[1]/div[8]/div[1]/span")
	private WebElement ccs;
	
	@FindBy(xpath = "//span[@title='+91']")
	private WebElement code;

	@FindBy(xpath = "//select[@name='countryCodePhone']")
	private WebElement ccd;

	@FindBy(id = "phone")
	private WebElement phoneno;
	
	@FindBy(id = "nlsms-women")
	private WebElement tcc;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/section/div/div/form/div[1]/div[11]/div/div[1]/div/div[1]/span")
	private WebElement date;
	
	@FindBy(xpath="//span[@title='25']")
	private WebElement dateno;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/section/div/div/form/div[1]/div[11]/div/div[1]/div/div[2]/span")
	private WebElement month;

	@FindBy(xpath = "(//span[@data-value='7'])[3]")
	private WebElement monthno;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/section/div/div/form/div[1]/div[11]/div/div[2]/span")
	private WebElement year;
	
	@FindBy(xpath = "//span[@title='1986']")
	private WebElement yearno;
	
	@FindBy(id = "en")
	private WebElement english;
	
	@FindBy(id="createAccountBtn")
	private WebElement createaccount;


	public WebElement getDateno() {
		return dateno;
	}


	public WebElement getMonthno() {
		return monthno;
	}


	public WebElement getYearno() {
		return yearno;
	}


	public WebElement getCok() {
		return cok;
	}


	public  WebElement getGender() {
		return gender;
	}


	public WebElement getFname() {
		return fname;
	}


	public WebElement getName() {
		return name;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getTc() {
		return tc;
	}


	public WebElement getPassword() {
		return password;
	}

	public WebElement getCcs() {
		return ccs;
	}
	
	public WebElement getCcd() {
		return ccd;
	}
	


	public WebElement getCode() {
		return code;
	}

	
	public WebElement getPhoneno() {
		return phoneno;
	}


	public WebElement getTcc() {
		return tcc;
	}


	public WebElement getDate() {
		return date;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getEnglish() {
		return english;
	}


	public WebElement getCreateaccount() {
		return createaccount;
	}
	
}


