package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.SnippetType;
//import io.cucumber.testng.AbstractTestNGCucumberTest;

@CucumberOptions(
		features = {"src/test/java/features"},
		dryRun = false,  // Only check for mapping of steps to step definitions, don't run tests
		snippets = SnippetType.CAMELCASE, //This sets the snippet style to camelCase
		glue = {"steps"},      // Adjust this to match your step definitions package
		monochrome = true //for Cleaner console output
		)
public class Runner extends AbstractTestNGCucumberTests{
	
	
	

	
}
