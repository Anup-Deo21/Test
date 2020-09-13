package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("fist test in day2 class");
	}
	
	@Test(enabled=false)
	public void hloan()
	{
		System.out.println("second test in day2 class");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute before test");
	}
}
