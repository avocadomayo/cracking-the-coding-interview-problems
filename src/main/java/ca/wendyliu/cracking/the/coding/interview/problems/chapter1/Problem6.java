package ca.wendyliu.cracking.the.coding.interview.problems.chapter1;

public class Problem6 {

    public static String compressString(String s) {
        int consecutiveCount = 0;
        StringBuilder compressed = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            consecutiveCount++;

            // if next char is different, write out current char and # occurrences
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressed.append(s.charAt(i));
                compressed.append(consecutiveCount);
                consecutiveCount = 0;
            }
        }

        return compressed.length() < s.length() ? compressed.toString() : s;
    }

    // This solution checks if result of compression is shorter than input String, and only compresses in that case.
    // Pro: more optimal if we don't have a lot of repeating chars. Also can initialize StringBuilder to its necessary
    // Con: need second loop, duplicates code
    public static String compressCheckAdvance(String str) {
        // check if compression is shorter than input
        int finalLength = countCompression(str);
        if (finalLength >= str.length()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder(finalLength);
        int consecutiveCount = 0;

        for (int i = 0; i < str.length(); i++) {
            consecutiveCount++;

            // if next char is different, write out current char and # occurrences
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(consecutiveCount);
                consecutiveCount = 0;
            }
        }

        return compressed.toString();
    }

    private static int countCompression(String str) {
        int compressionLength = 0;
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressionLength += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }

        return compressionLength;
    }

    // Misunderstood question. This attempt does not concat "1" if a char occurs just once
    public static String compressMyAttempt(String s) {
        char[] arr = new char[s.length() + 1];
        System.arraycopy(s.toCharArray(), 0, arr, 0, s.length());
        arr[s.length()] = '\0';

        StringBuilder builder = new StringBuilder();

        char prev = '\0';
        int count = 0;

        for (char c : arr) {
            if (prev == c) {
                count++;
            } else {
                if (count > 1) {
                    builder.append(count);
                }

                if (c >= 'A' && c <= 'z') builder.append(c);
                count = 1;
            }

            prev = c;
        }

        return builder.toString();
    }
}
