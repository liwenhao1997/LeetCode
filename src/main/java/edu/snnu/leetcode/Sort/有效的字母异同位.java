package edu.snnu.leetcode.Sort;

import java.util.Arrays;

public class 有效的字母异同位 {

    public static void main(String[] args) {
        isAnagram("a", "b");
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}
