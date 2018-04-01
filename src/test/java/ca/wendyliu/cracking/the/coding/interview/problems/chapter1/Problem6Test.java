package ca.wendyliu.cracking.the.coding.interview.problems.chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem6Test {

    @Test
    public void testSolution() {
        assertEquals("abc", Problem6.compressString("abc"));
        assertEquals("a2b4c1", Problem6.compressString("aabbbbc"));
        assertEquals("aabc", Problem6.compressString("aabc"));
    }

    @Test
    public void testCompressCheckAdvance() {
        assertEquals("abc", Problem6.compressCheckAdvance("abc"));
        assertEquals("a2b4c1", Problem6.compressCheckAdvance("aabbbbc"));
    }

    // misunderstood question in this attempt
    @Test
    public void testCompressMyAttempt() {
        assertEquals("abc", Problem6.compressMyAttempt("abc"));
        assertEquals("a2b4c", Problem6.compressMyAttempt("aabbbbc"));
        // fails
        // assertEquals("aabc", Problem6.compressMyAttempt("aabc"));
    }
}