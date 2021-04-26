package com.automation.pages;

import static org.openqa.selenium.support.How.LINK_TEXT;
import static org.openqa.selenium.support.How.XPATH;



import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.automation.Exception.CustomException;
import com.automation.utilities.WaitUtil;



/** Page elements and functions of HomePage
 * @author swathishetty
 *
 */

public class HomePage extends BasePage {
	@FindBy(how = LINK_TEXT, using = "Shop now")
	private WebElement shopNow;
	
	@FindBy(how = LINK_TEXT, using = "Home")
	private WebElement homeTab;
	

	@FindBy(how = XPATH, using = "//a[contains(text(),'Products')]")
	private WebElement products;
	
	@FindBy(how = LINK_TEXT, using = "Tables")
	private WebElement tables;
	
	@FindBy(how = XPATH, using = "//p[contains(text(),'Tables')]")
	private WebElement tablesDetail;
	
	@FindBy(how = LINK_TEXT, using = "Add to cart")
	private WebElement addToCart;

	@FindBy(how = XPATH, using = "//span[contains(text(),'Shopping cart')]")
	private WebElement shoppingCart;
    
	@FindBy(how = XPATH, using = "//*[contains(text(),'Got it')]")
	private WebElement gotIt;
	
	@FindBy(how = XPATH, using = "//span[@id='miniCartDetails']//*[contains(text(),'Checkout')]")
	private WebElement checkOut;
	
	
	static Logger logger = Logger.getLogger(HomePage.class);

	/**
	 * Verifies HomePage webelements
	 */
	public void verifyHomePage() {
		WaitUtil.pageLoad();
		assert(shopNow.isDisplayed());
		assert(homeTab.isDisplayed());
		if(gotIt.isDisplayed()) {
			gotIt.click();
		}
	}

	/**
	 * Verifies Selects table dropdown from Products category
	 */
	public void selectTable() {
		products.click();
		tables.click();
		WaitUtil.pageLoad();
		WaitUtil.visibilityOf(tablesDetail);
	}
	
	/**
	 * Adds items to cart
	 */
	public void addToCart() throws CustomException {
		try {
			clickAddToCart().navigateToCheckout();
		}catch(Exception e) {
			throw new CustomException("HomePage - addToCart error:",e);
		}
	}
	
	
	public void addTwiceToCart() throws CustomException {
		try {
			clickAddToCart().clickAddToCart().navigateToCheckout();
		}catch(Exception e) {
			throw new CustomException("HomePage - addToCart error:",e);
		}
	}
	private  HomePage clickAddToCart() {
		WaitUtil.pageLoad();
		WaitUtil.visibilityOf(addToCart);
		WaitUtil.elementToBeClickable(addToCart);
		addToCart.click();
		return this;
	}
	
	/**
	 * Navigates to checkout page
	 */
	private HomePage navigateToCheckout() {
		WaitUtil.pageLoad();
		WaitUtil.pageLoad();
		BasePage.initPage(HomePage.class);
		shoppingCart.click();
		WaitUtil.elementToBeClickable(checkOut);
		checkOut.click();
		return this;
	}

}
