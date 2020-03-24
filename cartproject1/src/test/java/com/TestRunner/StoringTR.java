package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC04_storingProductDetails"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class StoringTR {

}
