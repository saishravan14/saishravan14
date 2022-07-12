package asserts;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo_Asserts {
	@Test
	public void tc() {
		String ex = "Shravan";
		String ac = "Shravan";
		Assert.assertEquals(ac,ex);
		Reporter.log("Matched",true);
		//Assert.assertEquals(true, false); // it will stop the exectuion if the condition is
		Assert.assertEquals(false, false);
		Reporter.log("Matched2",true);
		
		List<Object> lst1 = new ArrayList<>();
		lst1.add("abc");
		lst1.add(6);
		lst1.add(true);
		List<Object> lst2 = new ArrayList<>();
		lst2.add("abc");
		lst2.add(6);
		lst2.add(true);
		
		Assert.assertEquals(lst1,lst2);
		SoftAssert sa = new SoftAssert();// it will the allow the exection even if the ex condition
		sa.assertEquals(9,15); // actual contion differ
		Reporter.log("Matched3",true);
		sa.assertAll();
		
	}

}
