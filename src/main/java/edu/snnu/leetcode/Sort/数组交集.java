package edu.snnu.leetcode.Sort;

import java.util.Arrays;
import java.util.HashSet;

public class 数组交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        if (set1.size() < set2.size()) {
            return set_intersection(set1, set2);
        } else {
            return set_intersection(set2, set1);
        }
    }

    private int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        int[] arr = new int[set1.size()];
        int ids = 0;
        for (Integer num : set2) {
            if (set2.contains(num)) {
                arr[ids++] = num;
            }
        }
        return Arrays.copyOf(arr, ids);
    }
}
