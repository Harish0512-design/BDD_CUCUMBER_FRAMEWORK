package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "steps" }, plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"json:cucumber.json" }, monochrome = true, dryRun = false,
//		tags="@REGRESSION" 
//		tags = "@REGRESSION AND @SANITY"
//		tags = "@REGRESSION OR @SANITY"
		// tags = "not @REGRESSION"
		tags = "@ACCOUNTCREATION"

)
public class TestRunner {

}
