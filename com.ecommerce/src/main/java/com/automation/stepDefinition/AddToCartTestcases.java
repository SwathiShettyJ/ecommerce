package com.automation.stepDefinition;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.automation.Exception.CustomException;
import com.automation.configReader.AssessmentProjectConfig;
import com.automation.pages.BasePage;
import com.automation.pages.CheckOutPage;
import com.automation.pages.HomePage;
import com.automation.utilities.Browser;
import com.automation.utilities.InitFuntion;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddToCartTestcases {

	public WebDriver driver;

	public static AssessmentProjectConfig assessmentProjectConfig;

	static Logger logger = Logger.getLogger(AddToCartTestcases.class);

	public AddToCartTestcases() {
		driver = Browser.getDriver();
		assessmentProjectConfig = new InitFuntion().init();
		logger.info("Step completed - TC01_AddToCart");
	}

	@Given("^User is in 'Shopizer' Page$")
	public void userIsInShopizerPage() {
		driver.get(assessmentProjectConfig.gerShopizerUrl());
		BasePage.initPage(HomePage.class).verifyHomePage();
	}

	@Then("^select category 'Tables'$")
	public void selectCategory() {
		BasePage.initPage(HomePage.class).selectTable();
	}

	@Then("^add an item to cart$")
	public void addItem() throws CustomException {
		BasePage.initPage(HomePage.class).addToCart();
	}

	@Then("^click the item twice to add 2 quantity$")
	public void addItemTwice() throws CustomException {
		BasePage.initPage(HomePage.class).addTwiceToCart();
	}

	@Then("verify quantity {int} in checkout page")
	public void verifyOneItemAdded(int noOfItem) throws CustomException {
		BasePage.initPage(CheckOutPage.class).verifyItemAdded(noOfItem);
	}

	@Then("Change the quantity to {int} and verify total is {int}")
	public void changeQuanity(int noOfItem, int total) throws CustomException {
		BasePage.initPage(CheckOutPage.class).changeQuantity(noOfItem, total);
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		scenario.attach(fileContent, "image/png", "screenshot");

	}

	@After
	public void afterScenario(Scenario scenario) {
		Browser.closeDriver();

	}

}
