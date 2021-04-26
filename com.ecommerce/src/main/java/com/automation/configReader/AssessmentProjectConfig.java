package com.automation.configReader;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.DefaultValue;
import org.aeonbits.owner.Config.Key;
import org.aeonbits.owner.Config.Sources;

/** Config file Reader
 * @author swathishetty
 *
 */
@Sources({ "classpath:config/assessmentProject.properties" })
public interface AssessmentProjectConfig extends Config {

	@Key("shopizer.url")
	@DefaultValue("http://aws-demo.shopizer.com:8080/shop/")
	String gerShopizerUrl();
	
	@Key("driverPath")
	@DefaultValue("/eCommerce/src/test/resources/drivers/chromedriver")
	String getDriverPath();
	
	
	@Key("extentReport")
	@DefaultValue("/Users/swathishetty/Documents/Swathi/Assignment/ecommerce/com.ecommerce/src/test/resources/config/extent-config.xml")
	String getExtentReport();
	
	@Key("weatherbit.apitoken")
	@DefaultValue("<Put the token here>")
	String getApitoken();
	
	@Key("weatherbit.currentWeather")
	@DefaultValue("current")
	String getCurrentWeather();
	
	@Key("weatherbit.forecastDaily")
	@DefaultValue("forecast/daily")
	String getForecastDaily();
	

}
