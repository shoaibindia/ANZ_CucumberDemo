package TestRun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/featureFiles", 
		glue = "stepDefinition", 
		monochrome = true,
		plugin= {"pretty", "html:target/cucumber-html-report.html"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}