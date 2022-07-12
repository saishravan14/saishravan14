package testNG_testcases;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDP {
@DataProvider
public static String[][] demo(){
	String[][] a = new String[3][2];//row col
	a[0][0] ="UserA";
	a[0][1] ="A";
	a[1][0] ="UserB";
	a[1][1] ="B";
	a[2][0] ="UserC";
	a[2][1] ="C";
	return a;
}

@Test(dataProvider = "demo")
public void tc(String user,String pass) {
	Reporter.log(user+" "+pass,true);
}
}
