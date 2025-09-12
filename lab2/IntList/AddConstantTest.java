package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddConstantTest {

    @Test
    public void testAddConstantOne() {
        IntList lst = IntList.of(1, 2, 3, 4, 5);
        IntListExercises.addConstant(lst, 1);
        assertEquals("2 -> 3 -> 4 -> 5 -> 6", lst.toString());
    }

    @Test
    public void testAddConstantTwo() {
        IntList lst = IntList.of(1, 2, 3, 4, 5);
        IntListExercises.addConstant(lst, 2);
        assertEquals("3 -> 4 -> 5 -> 6 -> 7", lst.toString());
    }

    @Test
    public void testAddToLargeList() {
        IntList lst = IntList.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        IntListExercises.addConstant(lst, 10);
        assertEquals("11 -> 12 -> 13 -> 14 -> 15 -> 16 -> 17 -> 18 -> 19", lst.toString());
    }

    @Test
    public void testAddConstantWithSingleElement() {
        IntList lst = IntList.of(5);
        IntListExercises.addConstant(lst, 3);
        assertEquals("8", lst.toString());
    }

    @Test
    public void testAddConstantWithNegativeValue() {
        IntList lst = IntList.of(10, 20, 30);
        IntListExercises.addConstant(lst, -5);
        assertEquals("5 -> 15 -> 25", lst.toString());
    }

    @Test
    public void testAddConstantWithZero() {
        IntList lst = IntList.of(1, 2, 3);
        IntListExercises.addConstant(lst, 0);
        assertEquals("1 -> 2 -> 3", lst.toString());
    }

    @Test
    public void testAddConstantWithNullList() {
        IntList lst = null;
        IntListExercises.addConstant(lst, 5);
        assertNull(lst);
    }
}
