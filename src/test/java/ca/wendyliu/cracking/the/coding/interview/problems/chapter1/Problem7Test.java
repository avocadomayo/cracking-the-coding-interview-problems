package ca.wendyliu.cracking.the.coding.interview.problems.chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem7Test {

    @Test
    public void testMyAttempt() {
        int[][] input = {{1, 2}, {3, 4}};
        int[][] rotatedInput = {{3, 1}, {4, 2}};

        assertArrayEquals(Problem7.rotateMyAttempt(input), rotatedInput);
    }

    @Test
    public void testMyAttemptChar() {
        int[][] input = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
        int[][] rotatedInput = {{'g', 'd', 'a'}, {'h', 'e', 'b'}, {'i', 'f', 'c'}};

        assertArrayEquals(Problem7.rotateMyAttempt(input), rotatedInput);
    }

    @Test
    public void testRotateInPlaceMyAttempt() {
        int[][] input = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
        int[][] rotatedInput = {{'g', 'd', 'a'}, {'h', 'e', 'b'}, {'i', 'f', 'c'}};

        assertArrayEquals(Problem7.rotateInPlaceMyAttempt(input), rotatedInput);
    }
}