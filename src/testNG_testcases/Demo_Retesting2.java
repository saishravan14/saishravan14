package testNG_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_Retesting2 {
WebDriver driver;
@Test(invocationCount = 2)  // execute 2 times
public void tc_1() {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.close();
}
@Test(invocationCount = 0)  // not execute 
public void tc_2() {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.close();
}
@Test(invocationCount = 1,enabled = false)  // not execute 
public void tc_3() {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.close();
}
@Test(enabled = true)  // execute 
public void tc_4() {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.close();
}
}
