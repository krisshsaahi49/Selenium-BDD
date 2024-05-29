package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"stepDefinitions"},
		tags="",
		plugin = {"pretty","html:target/cucumber-report.html"}
		)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
