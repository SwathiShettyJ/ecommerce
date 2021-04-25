package com.automation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.utilities.Browser;

public class BasePage {


	    public static <T extends BasePage> T initPage(Class<T> pageClass) {
	        return PageFactory.initElements(Browser.getDriver(), pageClass);
	    }
}