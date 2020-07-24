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

public class Stepdefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		String url = FileReaderManager.getInstance().getCrInstance().getUrl();

		enterurl(url);
		Thread.sleep(3000);

		mouseclick(pom.getHp().getLogin());
		Thread.sleep(3000);
	}

	@When("^user initiating the registration process$")
	public void user_initiating_the_registration_process() throws Throwable {
		mouseclick(pom.getHp().getRegister());
		Thread.sleep(3000);
	}

	@When("^user entering the personal details cum required fields for registration$")
	public void user_entering_the_personal_details_cum_required_fields_for_registration() throws Throwable {

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
	
	@When("^user enter the valid username \"([^\"]*)\" in username field$")
	public void user_enter_the_valid_username_in_username_field(String username) throws Throwable {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		pom.getHp().getEmail();
		mouseclick(pom.getHp().getEmail());
		inputtoWebElement(pom.getHp().getEmail(), username);
	
	}

	@When("^user enter the valid password \"([^\"]*)\" in password field$")
	public void user_enter_the_valid_password_in_password_field(String password) throws Throwable {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pwd")));
		pom.getHp().getPassword();
		mouseclick(pom.getHp().getPassword());
		inputtoWebElement(pom.getHp().getPassword(), password);
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginForm")));
		pom.getHp().getLoginbutton();
		mouseclick(pom.getHp().getLoginbutton());
	}
	
/*	@When("^user enter the valid username in username field$")
	public void user_enter_the_valid_username_in_username_field() throws Throwable {
		//mouseclick(pom.getHp().getLogin());
		//Thread.sleep(3000);
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.click();
		email.sendKeys("lesakki24@gmail.com");
	
	}

	@When("^user enter the valid password in password field$")
	public void user_enter_the_valid_password_in_password_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}*/

	@Then("^user confirm it navigates to the  homepage$")
	public void user_confirm_it_navigates_to_the_homepage() throws Throwable {
	
	}
	
	@Given("^user navigates to tshirt in men option$")
	public void user_navigates_to_tshirt_in_men_option() throws Throwable {
		actionMethod(pom.getUh().getMen(), pom.getUh().getTshirt(), "element");
		Thread.sleep(3000);
		
	}

	@When("^user click on tshirt image to be booked$")
	public void user_click_on_tshirt_image_to_be_booked() throws Throwable {
		mouseclick(pom.getSp().getTimg());
		Thread.sleep(3000);
	}

	@When("^user choose the quantity of the tshirt$")
	public void user_choose_the_quantity_of_the_tshirt() throws Throwable {
		mouseclick(pom.getPa().getColor());
		Thread.sleep(3000);
	}

	@When("^user choose the size of the tshirt$")
	public void user_choose_the_size_of_the_tshirt() throws Throwable {
	mouseclick(pom.getPa().getSize());
	Thread.sleep(3000);
	mouseclick(pom.getPa().getSizemed());
	Thread.sleep(3000);
	}

	@When("^user choose the addchart to hold the booking$")
	public void user_choose_the_addchart_to_hold_the_booking() throws Throwable {
	mouseclick(pom.getPa().getAddcart());
	Thread.sleep(3000);
	}

	@When("^user to proceed to checkout$")
	public void user_to_proceed_to_checkout() throws Throwable {
	}

	@Then("^user verifies selection of tshirt is done$")
	public void user_verifies_selection_of_tshirt_is_done() throws Throwable {

	
	}


}
