package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day3 {
	
	@BeforeClass
	public void beforClass() {
		System.out.println("I will execute before class day3");
	}

	@Parameters({ "URL", "APIKey/usrname" })
	@Test
	public void webLoginCarLoan(@Optional()String urlname, @Optional()String key) {
		// selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);

	}

	@BeforeMethod
	public void beforeEvery() {
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@BeforeGroups("Smoke")
	public void beforeGroup() {
		System.out.println("I will execute before group");
	}
	
	@AfterGroups("Smoke")
	public void afterGroup() {
		System.out.println("I will execute after group");
	}

	@AfterMethod
	public void afterEvery() {
		System.out.println("I will execute after  every test method in day 3 class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I will execute after class day3");
	}

	@Test(groups = { "Smoke" })
	public void MobileLogincarLoan() {
		// Appium
		System.out.println("Mobilelogincar");
	}

	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I will execute before suite");
	}

	@Test
	public void MobilesignimcarLoan() {
		// Appium
		System.out.println("Mobile SIGIN");
	}

	@Test()
	public void mobileSignoutcarLoan() {
		// Appium
		System.out.println("Mobile SIGNOUT");
	}

	@Test(dependsOnMethods = { "webLoginCarLoan", "mobileSignoutcarLoan" })
	public void APIcarLoan() {
		// Rest API automation
		System.out.println("APIlogincar");
	}

	
}
