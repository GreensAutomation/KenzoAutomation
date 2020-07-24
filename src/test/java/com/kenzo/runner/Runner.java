package com.kenzo.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.kenzo.helper.FileReaderManager;
import com.kenzoautomation.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\kenzo\\feature",
glue="com\\kenzo\\stepdefinition",
plugin= {"pretty", "html:Report","com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html","rerun:Report/return.txt"}, 
monochrome = true, dryRun = false, strict = true)

public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws IOException, InterruptedException {
		
		String broswerName=FileReaderManager.getInstance().getCrInstance().getBroswerName();
		driver=BaseClass.broswerLaunch(broswerName);
		Thread.sleep(3000);
	}

	@AfterClass
	public static void tearDown() {
		//driver.close();
	}
}
