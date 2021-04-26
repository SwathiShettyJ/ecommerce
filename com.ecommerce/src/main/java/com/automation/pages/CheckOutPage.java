package com.automation.pages;

import static org.openqa.selenium.support.How.LINK_TEXT;
import static org.openqa.selenium.support.How.NAME;
import static org.openqa.selenium.support.How.XPATH;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.automation.Exception.CustomException;
import com.automation.utilities.WaitUtil;

/** Check Out Page webelements and functions
 * @author swathishetty
 *
 */
/**
 * @author swathishetty
 *
 */
public class CheckOutPage extends BasePage {
	@FindBy(how = NAME, using = "quantity")
	private WebElement quantity;

	@FindBy(how = LINK_TEXT, using = "RECALCULATE")
	private WebElement recalculate;

	@FindBy(how = XPATH, using = "//td[@data-th='Total']//strong")
	private WebElement totalWe;

	static Logger logger = Logger.getLogger(CheckOutPage.class);

	/**
	 * Funtion to verify items added in cart
	 * 
	 * @param noOfItem
	 * @throws CustomException
	 */
	public void verifyItemAdded(int noOfItem) throws CustomException {
		WaitUtil.pageLoad();
		try {
			assert (quantity.getAttribute("value").toString().equals(String.valueOf(noOfItem)));

		} catch (Exception e) {
			throw new CustomException("CheckOutPage- verifyItemAdded error:", e);
		}
	}

	/**
	 * Funtion to change quantity in cart
	 * 
	 * @param noOfItem
	 * @param total
	 * @throws CustomException
	 */
	public void changeQuantity(int noOfItem, int total) throws CustomException {
		WaitUtil.pageLoad();
		try {
			quantity.clear();
			quantity.sendKeys(String.valueOf(noOfItem));
			clickRecalculate();
			System.out.println("totalWe.getText()" + totalWe.getText() + "-total:" + total);
			BasePage.initPage(CheckOutPage.class);
			assert (totalWe.getText().contains(String.valueOf(total)));
		} catch (Exception e) {
			throw new CustomException("CheckOutPage-changeQuantity error:", e);
		}
	}

	private void clickRecalculate() throws InterruptedException {
		recalculate.click();
		WaitUtil.pageLoad();
		Thread.sleep(2000);
	}

}
