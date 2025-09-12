package DebugExercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class DebugExercise2Test {

    @Test
    public void testSumOfElementwiseMaxes_emptyArrays() {
        int[] a = {};
        int[] b = {};
        int expected = 0;
        int actual = DebugExercise2.sumOfElementwiseMaxes(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumOfElementwiseMaxes_singleElementArrays() {
        int[] a = {10};
        int[] b = {5};
        int expected = 10;
        int actual = DebugExercise2.sumOfElementwiseMaxes(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumOfElementwiseMaxes_negativeNumbers() {
        int[] a = {-1, -2, -3};
        int[] b = {-4, -5, -6};
        int expected = -6; // maxes are -1, -2, -3
        int actual = DebugExercise2.sumOfElementwiseMaxes(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumOfElementwiseMaxes_duplicateValues() {
        int[] a = {1, 1, 1};
        int[] b = {0, 0, 0};
        int expected = 3;
        int actual = DebugExercise2.sumOfElementwiseMaxes(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumOfElementwiseMaxes_mixedMaxElements() {
        int[] a = {100, 2, 3};
        int[] b = {1, 200, 4};
        int expected = 304; // maxes are 100, 200, 4
        int actual = DebugExercise2.sumOfElementwiseMaxes(a, b);
        assertEquals(expected, actual);
    }
}
