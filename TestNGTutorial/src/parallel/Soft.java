package parallel;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(test.Listeners.class)			
public class Soft {
	@Test(priority=1, dependsOnMethods="method2")
	public void method1()
	{
		System.out.println("method1");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	public void method2()
	{
		SoftAssert as = new SoftAssert();
		System.out.println("method2");
		as.assertTrue(false);
		/* as.assertAll(); //To throw all error messages at the end of test*/
	}
	
	@Test(priority=3)
	public void method3()
	{
		System.out.println("method3");
		Assert.assertTrue(true);

	}

}
