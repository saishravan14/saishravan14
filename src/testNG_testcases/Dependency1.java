package testNG_testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency1 {
@Test()
public void login() {
	Reporter.log("tc3",true);
}
@Test(dependsOnMethods = "login")
public void findFriends() {
	Reporter.log("tc4",true);
}
@Test(dependsOnMethods = "login")
public void chat() {
	Reporter.log("tc1",true);
	Assert.fail();
}
@Test(dependsOnMethods = {"chat","findFriends"})
public void logout() {
	Reporter.log("tc2",true);
}
}
