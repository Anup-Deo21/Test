package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute after test");
	}

	@Test
	public void firstTest() {
		System.out.println("First Test in day1 class");
		Assert.assertTrue(false);
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I will execute after suite");
	}

	@Test(dependsOnMethods = { "firstTest"})
	public void secondTest() {
		System.out.println("Second Test in day1 class");
	}

}
