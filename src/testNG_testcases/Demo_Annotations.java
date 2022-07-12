package testNG_testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_Annotations {
@BeforeMethod
public void bm() {
	Reporter.log("BM",true);
}
@AfterMethod
public void am() {
	Reporter.log("AM",true);
}
@BeforeClass
public void beforeC() {
	Reporter.log("BeforeC",true);
}
@AfterClass
public void afC() {
	Reporter.log("AfC",true);
}
@BeforeTest
public void bt() {
	Reporter.log("bt",true);
}
@AfterTest
public void at() {
	Reporter.log("At",true);
}
@Test
public void test() {
	Reporter.log("test",true);
}
@BeforeSuite
public void bs() {
	Reporter.log("bs",true);
}
@AfterSuite
public void as() {
	Reporter.log("As",true);
}
}
