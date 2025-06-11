//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lowercase English letters if it is non-empty. 
// 
//
// Related Topics String Trie 👍 19242 👎 4734


package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            if (strs.length == 1) {
                return strs[0];
            }

            StringBuilder result = new StringBuilder();
            int idx = 0;
            char t = ' ';
            while (true) {
                for (int i = 0; i < strs.length; i++) {
                    if (idx > strs[i].length() - 1) {
                        return result.toString();
                    }

                    if (i == 0) {
                        t = strs[i].charAt(idx);
                        continue;
                    }

                    if (t != strs[i].charAt(idx)) {
                        return result.toString();
                    }
                }
                result.append(t);
                idx++;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}