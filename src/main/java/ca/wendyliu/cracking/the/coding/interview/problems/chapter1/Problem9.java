package ca.wendyliu.cracking.the.coding.interview.problems.chapter1;

public class Problem9 {

    // test if s2 is a rotation of s1
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String s1s1 = s1 + s1;
        return s1s1.contains(s2);
    }
}
