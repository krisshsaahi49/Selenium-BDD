package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	WebDriver driver;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "subject")
	public WebElement subject;

	@FindBy(id = "message")
	public WebElement message;

	@FindBy(css = "button[type='submit']")
	public WebElement submit;

	@FindBy(xpath = "//p[contains(text(),'Email sent successfully!')]")
	public WebElement confirmationmsg;

	public void launchURL() {
		driver.get("https://krisshsaahi.dev");
	}

	public void scrollToEmail() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", email);
	}

	public void sendEmail(String EMAIL, String SUBJECT, String MESSAGE) {
		email.sendKeys(EMAIL);
		subject.sendKeys(SUBJECT);
		message.sendKeys(MESSAGE);
		submit.click();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions
				.textToBePresentInElement(confirmationmsg, "Email sent successfully!"));
	}

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

}
