package testNG_testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validate_Actitime {
	WebDriver driver;
	@BeforeMethod
	public void beforeM() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("BM", true);
	}
	@Test
	public void testcase1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		
		String un = readFile("E:/acti.xlsx", "Sheet1", 0, 0);

		if (un == "admin") {
			driver.findElement(By.id("username")).sendKeys(un);
		} else if (un == null) {
			System.out.println("valid username not found");
		}
		Thread.sleep(2000);
		String pass = readFile("E:/acti.xlsx", "Sheet1", 0, 1);

		if (pass == "manager") {
			driver.findElement(By.name("pwd")).sendKeys(pass, Keys.ENTER);
		} else if (un == null) {
			System.out.println("valid password not found");
		}	
	}
	
	
	@Test
	public static String readFile(String path, String sheet, int row, int cell) // readfile method for validation
			throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);

		int rCount = sh.getPhysicalNumberOfRows();
		// System.out.println(rCount);

		int cCount = sh.getRow(row).getLastCellNum();
		 System.out.println(cCount);

		for (int i = 0; i < rCount; i++) {
				Cell cl = sh.getRow(i).getCell(cell);

				if (cl.getStringCellValue().equalsIgnoreCase("admin")) { // this method is use to fetch the cell value
					return "admin";
				}
				else if (cl.getStringCellValue().equalsIgnoreCase("manager")) {
					return "manager";
				}
			}
		return null;

	}

	@AfterMethod
	public void afterM() throws InterruptedException {
	    Thread.sleep(2000);
		driver.close();
		Reporter.log("AM", true);
	}

}
