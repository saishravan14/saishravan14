package testNG_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Testcase {
	WebDriver driver;
	@Test(priority = 3)
	public void g() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Reporter.log("third",true);
		driver.close();
	}
	@Test(priority = 2)
	public void fb() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com/");
		Reporter.log("sec",true);
		driver.close();
	}
	@Test(priority = 1)
	public void gmail() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Reporter.log("first",true);
		driver.close();
	}
}
