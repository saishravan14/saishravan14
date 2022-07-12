package testNG_testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void tc(String name) {

		if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./software2/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./software/msedgedriver.exe");
			driver = new EdgeDriver();

		} else if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			driver = null;
		}
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();

	}
}
