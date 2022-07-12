package testNG_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing_Multi {
	WebDriver driver;

	@BeforeMethod
	public void beforM() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Reporter.log("BM", true);
	}

	@Test
	public void tc() {
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		Reporter.log("tc", true);
	}

	@Test
	public void tc1() {
		driver.findElement(By.name("q")).sendKeys("TestNG", Keys.ENTER);
		Reporter.log("tc1", true);
	}

	@AfterMethod
	public void afterM() {
		driver.close();
		Reporter.log("AM", true);
	}

}
