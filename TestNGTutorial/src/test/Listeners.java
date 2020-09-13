package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners
public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" is started");

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" is failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" is skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
}
