package testNG_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Addddd {
	WebDriver driver;
	@Test
	public void a() {
		System.setProperty("webdriver.edge.driver", "./software/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
	@Test
	public void tc_1() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}
}
