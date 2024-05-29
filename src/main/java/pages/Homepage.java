package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

}
