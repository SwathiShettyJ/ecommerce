package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features   = "src/test/resources/features",
	    monochrome = true,
	    glue       = "com/automation/stepDefinition",
	    tags	   = "@shoppingCart",
	    plugin 	= { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)

public class TestNGRunner extends AbstractTestNGCucumberTests{

}
