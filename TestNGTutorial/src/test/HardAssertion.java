package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	String className = "HardAssertion";

    @Test
    public void test_UsingHardAssertion() {
        Assert.assertTrue(true == true);
        Assert.assertEquals("HardAssertion", "HardAssertion");
        Assert.assertEquals(className, "HardAssertion");
        System.out.println("Successfully passed!");
    }
}


// https://www.techbeamers.com/using-testng-assertions-selenium/