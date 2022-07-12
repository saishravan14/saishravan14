package testNG_testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency_Groups {
@Test(groups = "functional")
public void tc_01f() {
	Reporter.log("F1",true);
}
@Test(groups = "functional")
public void tc_02f() {
	Reporter.log("F2",true);
}
@Test(groups = "functional")
public void tc_03f() {
	Reporter.log("F3",true);
}
@Test(groups ="intigration",dependsOnGroups = "functional")
public void tc_01I() {
	Reporter.log("I1",true);
}
@Test(groups ="intigration",dependsOnGroups = "functional")
public void tc_02I() {
	Reporter.log("I2",true);
}
@Test(groups ="system",dependsOnGroups = "intigration")
public void tc_01S() {
	Reporter.log("S1",true);
}
}
