package com.kenzoautomation.baseclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver broswerLaunch(String broswerName) {
		try {
			if (broswerName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Vigneshwari\\eclipse-workspace\\KenzoAutomation\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}

			else if (broswerName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Vigneshwari\\eclipse-workspace\\KenzoAutomation\\driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

			else {
				System.out.println("Invalid broswer");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void inputtoWebElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void mouseclick(WebElement element) {

		element.click();
	}

	public static void enterurl(String url) {

		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void naviback() {

		driver.navigate().back();
	}

	public static void naviforward() {

		driver.navigate().forward();

	}

	public static void frameswitch() {

		driver.switchTo().frame(0);

	}

	public static void navito(String url) {

		driver.navigate().to(url);

	}

	public static void waitforvisibilityofelmt(WebElement element) {

		try {
			WebDriverWait wb = new WebDriverWait(driver, 30);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void scroll(WebElement elements) {
		
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView();", elements);
		 
	}


	public static void dropDownMethod(WebElement element, String option, String value) {

		Select s = new Select(element);
		if (option.equalsIgnoreCase("Value")) {
			s.selectByValue(value);
		}

		else if (option.equalsIgnoreCase("VisibleText")) {
			s.selectByVisibleText(value);
		}

		else if (option.equalsIgnoreCase("Index")) {
			int i = Integer.parseInt(value);
			s.selectByIndex(i);
		}
	}
	public static void getopt(WebElement element, String value) {
		Select y = new Select(element);
		List<WebElement> options = y.getOptions();
		for (WebElement y1 : options) {
			if(y1.getText().equals("value"));
		}
	}

	
	
	public static void actionMovetoElement(WebElement element) {
		Actions ack = new Actions(driver);
		ack.moveToElement(element).perform();
	}

	public static void allElements(List<WebElement> values, String value) {
		for (WebElement options : values) {
			if (options.getText().equals("value")) {
				options.click();
			}

		}
	}

	public static void actionMethod(WebElement element, WebElement element1, String option) {

		Actions ac = new Actions(driver);

		if (option.equalsIgnoreCase("Element")) {
			ac.moveToElement(element).perform();
			ac.click(element1).perform();

		}

		else if (option.equalsIgnoreCase("context")) {
			ac.contextClick(element).perform();
		} else if (option.equalsIgnoreCase("move")) {
			ac.moveToElement(element);
		}

	}

}
