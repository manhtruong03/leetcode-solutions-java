//For two strings s and t, we say "t divides s" if and only if s = t + t + t + .
//.. + t + t (i.e., t is concatenated with itself one or more times). 
//
// Given two strings str1 and str2, return the largest string x such that x 
//divides both str1 and str2. 
//
// 
// Example 1: 
//
// 
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
// 
//
// Example 2: 
//
// 
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
// 
//
// Example 3: 
//
// 
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""
// 
//
// 
// Constraints: 
//
// 
// 1 <= str1.length, str2.length <= 1000 
// str1 and str2 consist of English uppercase letters. 
// 
//
// Related Topics Math String 👍 5691 👎 1575


package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        Solution solution = new GreatestCommonDivisorOfStrings().new Solution();
        List<String> testCase = new ArrayList<>(List.of(
                "ABCABC", "ABC",
                "ABABAB", "ABAB",
                "LEET", "CODE",
                "ABABABAB", "ABAB"
        ));
        int count = 1;
        for (int i = 0; i < testCase.size(); i += 2) {
            System.out.printf("Test #%s: %s%n", count++, solution.gcdOfStrings(testCase.get(i), testCase.get(i + 1)));
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isDivides(String str, String pattern) {
            int space = pattern.length();
            for (int i = 0; i < str.length(); i += space) {
                int endIndex = i + space;
                if (endIndex > str.length() || !pattern.equals(str.substring(i, endIndex))) {
                    return false;
                }
            }
            return true;
        }

        public String gcdOfStrings(String str1, String str2) {
            if (str2.length() == Math.min(str1.length(), str2.length())) {
                String t = str1;
                str1 = str2;
                str2 = t;
            }

            List<String> divides = new ArrayList<>();

            for (int i = 1; i <= str1.length() / 2; i++) {
                String pattern = str1.substring(0, i);
                if (isDivides(str1, pattern)) {
                    divides.add(pattern);
                }
            }

            divides.add(str1);

            List<String> answers = new ArrayList<>();
            for (String pattern : divides) {
                if (isDivides(str2, pattern)) {
                    answers.add(pattern);
                }
            }

            return (answers.isEmpty()) ? "" : answers.getLast();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}