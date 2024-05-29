package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;

public class HomepageSteps {
	WebDriver driver;
	JavascriptExecutor js;
	Homepage homepage;
	
	@Before
	public void init() {
		Base.start();
		homepage = new Homepage(Base.getDriver());
	}

	@Given("user naviagtes to krisshportfolio")
	public void user_naviagtes_to_krisshportfolio() {
		homepage.launchURL();
	}

	@When("user clicks on contact us")
	public void user_clicks_on_contact_us() {
		homepage.scrollToEmail();
	}

	@When("user send email with {string}, {string} and {string}")
	public void user_send_email_with_and(String email, String subject, String message) {
		homepage.sendEmail(email, subject, message);
	}
	
	@Then("user close the browser")
	public void user_close_browser() {
		Base.getDriver().close();
	}
	
	@After
	public void teardown() {
		Base.end();
	}

}
