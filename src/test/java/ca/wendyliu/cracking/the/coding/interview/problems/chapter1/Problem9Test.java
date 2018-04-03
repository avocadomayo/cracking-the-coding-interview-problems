package ca.wendyliu.cracking.the.coding.interview.problems.chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem9Test {

    @Test
    public void test() {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        assertTrue(Problem9.isRotation(s1, s2));
    }
}