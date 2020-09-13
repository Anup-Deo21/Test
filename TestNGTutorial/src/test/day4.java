package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//rahulonlinetutor@gmail.com
public class day4 {

	@Parameters({ "URL" })
	@Test(priority=1)
	public void WebloginHomeLoan(String uname) {
		// selenium
		System.out.println("First test in Day4 Class");
		System.out.println(uname);
	}

	@Test(groups = { "Smoke" },priority=2)
	public void MobileLoginHomeLoan() {
		// Appium
		System.out.println("Second Test in Day4 class");
	}

	@Test(dataProvider = "getData",priority=3)
	public void LoginAPIHomeLoan(String username, String password) {
		// Rest API automation
		System.out.println("Third Test in Day4 class");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData() {

		// 1st combiantion - username password - good credit history= row
		// 2nd - username password - no crdit history
		// 3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "setusername";
		data[0][1] = "password";
		// couloumns in the row are nothing but values for that particualar
		// combination(row)

		// 2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";

		// 3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;

	}

	
}
