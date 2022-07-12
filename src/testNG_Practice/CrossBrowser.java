package testNG_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
WebDriver driver;
@Test
@Parameters("browser")

public void tc(String name) {
	if(name.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver = new ChromeDriver();
	}else if(name.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver","./software/msedgedriver.exe");
		driver = new EdgeDriver();
	}else {
		driver = null;
	}
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	driver.close();
}
}
