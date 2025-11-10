package com.scmtool;

public class TextUtils {

    private TextUtils() {}

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        String normalized = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i = 0, j = normalized.length() - 1;
        while (i < j) {
            if (normalized.charAt(i) != normalized.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
