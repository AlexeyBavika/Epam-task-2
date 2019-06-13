import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class TestClassTest {
    @Rule
    public Timeout timeout = new Timeout(100);

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void hasToReturnSumOfTwoNumbers() {
        int firstNum = 10, secondNum = 20;
        int result = firstNum + secondNum;
        assertEquals("Must be equals", result, TestClass.sumOfTwoNumbers(firstNum, secondNum));
    }

    @Test
    public void hasToReturnIllegalArgumentExceptionIfOneOfTheNumbersIsZero() {
        int firstNum = 10, secondNum = 0;
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Arguments must be not zero");
        TestClass.divideTwoNumbers(firstNum, secondNum);
    }

    @Test
    public void hasToReturnTrueIfNumberIsNegative() {
        int number = -5;
        assertTrue("must be true", TestClass.isNegativeNumber(number));
    }

    @Test
    public void hasToReturnTrueAfterEquals() {
        String hello = "Hello";
        assertEquals(true, hello.equals(TestClass.helloPrint()));
    }
}