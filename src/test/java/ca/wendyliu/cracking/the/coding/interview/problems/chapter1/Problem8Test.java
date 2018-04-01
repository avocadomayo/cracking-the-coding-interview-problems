package ca.wendyliu.cracking.the.coding.interview.problems.chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem8Test {

    @Test
    public void testZeroMatrixMyAttempt() {
        int[][] input = {{0, 2}, {3, 4}};
        int[][] zeroMatrix = {{0, 0}, {0, 4}};

        int[][] input2 = {{0, 2, 0}};
        int[][] zeroMatrix2 = {{0, 0, 0}};

        assertArrayEquals(zeroMatrix, Problem8.zeroMatrixMyAttempt(input));
        assertArrayEquals(zeroMatrix2, Problem8.zeroMatrixMyAttempt(input2));
    }

    @Test
    public void testSolution() {
        int[][] input = {{0, 2}, {3, 4}};
        int[][] zeroMatrix = {{0, 0}, {0, 4}};

        int[][] input2 = {{0, 2, 0}};
        int[][] zeroMatrix2 = {{0, 0, 0}};

        assertArrayEquals(zeroMatrix, Problem8.setZeroes(input));
        assertArrayEquals(zeroMatrix2, Problem8.setZeroes(input2));
    }
}