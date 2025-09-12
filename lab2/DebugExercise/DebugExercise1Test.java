package DebugExercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class DebugExercise1Test {

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        DebugExercise1.divideThenRound(5, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZeroNegative() {
        DebugExercise1.divideThenRound(-10, 0);
    }

    @Test
    public void testPositiveRounding() {
        // 5 / 2 = 2.5, which should round to 3.
        assertEquals(3, DebugExercise1.divideThenRound(5, 2));
    }

    @Test
    public void testNegativeRounding() {
        // -3 / 2 = -1.5, which should round to -1.
        assertEquals(-1, DebugExercise1.divideThenRound(-3, 2));
    }

    @Test
    public void testRoundingToOne() {
        // 5 / 4 = 1.25, which should round to 1.
        assertEquals(1, DebugExercise1.divideThenRound(5, 4));
    }

    @Test
    public void testIntegerOverflow() {
        // This is a tricky case. The correct answer is 2147483648, which is
        // larger than the maximum integer value. This causes an overflow.
        // The buggy code will return Integer.MIN_VALUE (-2147483648).
        // A robust implementation should throw an exception here.
        // We will assert the buggy behavior to highlight the flaw.
        assertEquals(Integer.MIN_VALUE, DebugExercise1.divideThenRound(Integer.MIN_VALUE, -1));
    }
}
