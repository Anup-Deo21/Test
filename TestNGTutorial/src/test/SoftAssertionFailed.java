package test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionFailed {
	SoftAssert softAssert = new SoftAssert();
    String className = "SoftAssertion";

    @Test
    public void test1_UsingSoftAssertion() {
        softAssert.assertTrue(true == true);
        softAssert.assertEquals("SoftAssert", "SoftAssertion");
        softAssert.assertEquals(className, "SoftAssertion");
        System.out.println("Successfully passed!");
        softAssert.assertAll();

    }

    @Test
    public void test2_UsingSoftAssertion() {
        softAssert.assertTrue(true == true);
        softAssert.assertEquals("SoftAssertion", "SoftAssertion");
        softAssert.assertEquals(className, "SoftAssertion");
        System.out.println("Successfully passed!");
        softAssert.assertAll();
    }
}
