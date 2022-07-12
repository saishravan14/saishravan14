package testNG_testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataExelDemo {
@Test(dataProviderClass = testNG_testcases.ReadDP.class,dataProvider="read")
public void tc(String user,String pass) throws InterruptedException {
	Reporter.log(user+" "+pass,true);
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String title1=driver.getTitle();
	Reporter.log(title1,true);
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.name("pwd")).sendKeys(pass,Keys.ENTER);
	Thread.sleep(2000);
	String title2=driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertNotEquals(title1,title2);
	if(title1.equals(title2)) {
		Reporter.log("login unsuccessful",true);
	}
	else {
		Reporter.log("login successful",true);
	}
	driver.quit();
	sa.assertAll();
}
}
