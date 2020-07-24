package com.kenzo.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kenzo.helper.FileReaderManager;
import com.kenzo.pom.PageObjectManager;
import com.kenzo.runner.Runner;
import com.kenzoautomation.baseclass.BaseClass;

import cucumber.api.java.en.*;

public class Stepdefinition extends BaseClass
{
	
	public static WebDriver driver=Runner.driver;
	public static PageObjectManager pom= new PageObjectManager(driver);
	
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
	  String url=FileReaderManager.getInstance().getCrInstance().getUrl();
	   
	  	enterurl(url);
	   Thread.sleep(3000);
	   
	   mouseclick(pom.getHp().getLogin());
	   Thread.sleep(3000);
	}

	@When("^user initiating the registration process$")
	public void user_initiating_the_registration_process() throws Throwable 
	{
		mouseclick(pom.getHp().getRegister());
		Thread.sleep(3000);
	}

	@When("^user entering the personal details cum required fields for registration$")
	public void user_entering_the_personal_details_cum_required_fields_for_registration() throws Throwable 
	{
	
		mouseclick(pom.getRp().getCok());
		Thread.sleep(3000);	
		
		mouseclick(pom.getRp().getGender());
		Thread.sleep(3000);
		
		inputtoWebElement(pom.getRp().getFname(), "L Esakki");
		Thread.sleep(3000);
		
		inputtoWebElement(pom.getRp().getName(), "L Esakki Muthu");
		Thread.sleep(3000);
		
		inputtoWebElement(pom.getRp().getEmail(), "lesakki24@gmail.com");
		Thread.sleep(3000);
		
		mouseclick(pom.getRp().getTc());
		Thread.sleep(3000);
		
		inputtoWebElement(pom.getRp().getPassword(), "India@2070");
		Thread.sleep(3000);
		
		mouseclick(pom.getRp().getCcs());
		Thread.sleep(3000);
		
		mouseclick(pom.getRp().getCode());
		Thread.sleep(3000);
		
		inputtoWebElement(pom.getRp().getPhoneno(), "994059388");
		Thread.sleep(3000);
		
		mouseclick(pom.getRp().getTcc());
		Thread.sleep(3000);
		
		mouseclick(pom.getRp().getDate());
		Thread.sleep(3000);
		
		mouseclick(pom.getRp().getDateno());
		Thread.sleep(3000);
		
		mouseclick(pom.getRp().getMonth());
		Thread.sleep(3000);
		
		mouseclick(pom.getRp().getMonthno());
		Thread.sleep(3000);
		
		mouseclick(pom.getRp().getYear());
		Thread.sleep(3000);
		
		mouseclick(pom.getRp().getYearno());
		Thread.sleep(3000);
		
		mouseclick(pom.getRp().getEnglish());
		Thread.sleep(3000);
	}

	@When("^user completes the registration process$")
	public void user_completes_the_registration_process() throws Throwable {
		mouseclick(pom.getRp().getCreateaccount());
		Thread.sleep(3000);
	
	}

	@Then("^user receving the user id credentials details$")
	public void user_receving_the_user_id_credentials_details() throws Throwable {
	
	}



}
