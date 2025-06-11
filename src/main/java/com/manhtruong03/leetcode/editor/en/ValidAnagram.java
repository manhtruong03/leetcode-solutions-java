//Given two strings s and t, return true if t is an anagram of s, and false 
//otherwise. 
//
// 
// Example 1: 
//
// 
// Input: s = "anagram", t = "nagaram" 
// 
//
// Output: true 
//
// Example 2: 
//
// 
// Input: s = "rat", t = "car" 
// 
//
// Output: false 
//
// 
// Constraints: 
//
// 
// 1 <= s.length, t.length <= 5 * 10⁴ 
// s and t consist of lowercase English letters. 
// 
//
// 
// Follow up: What if the inputs contain Unicode characters? How would you 
//adapt your solution to such a case? 
//
// Related Topics Hash Table String Sorting 👍 13076 👎 433


package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new ValidAnagram().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram(String s, String t) {
            int n = s.length();
            if (n != t.length()) {
                return false;
            }

            Map<Character, Integer> frequency = new HashMap<>();
            for (int i = 0, k = n - 1; i < n; i++, k--) {
                frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i), 0) + 1);
                frequency.put(t.charAt(k), frequency.getOrDefault(t.charAt(k), 0) - 1);
            }

            for (int num : frequency.values()) {
                if (num != 0) {
                    return false;
                }
            }

            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}