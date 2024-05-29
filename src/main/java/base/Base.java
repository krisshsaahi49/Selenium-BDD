package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	private static WebDriver driver;
	private static String browser = "GC";
	
	private Base() {
		// singleton implementation
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void start() {
		if (driver == null) {
			switch (browser) {
			case "GC":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "SF":
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			}
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public static void end() {
		if(driver!=null) {
			driver.quit();
			driver =null;
		}
	}
}
