package parallel;

import org.testng.annotations.Test;

public class TestParallelTwo {
	@Test
	public void testCaseOne() {
		//Printing Id of the thread on using which test method got executed
		System.out.println("Second Test Case with Thread Id:- "
				+ Thread.currentThread().getId());
	}

	@Test
	public void testCaseTwo() {
		////Printing Id of the thread on using which test method got executed
		System.out.println("Second Test Case with Thread Id:- "
				+ Thread.currentThread().getId());
	}

}
