//Write a function that reverses a string. The input string is given as an 
//array of characters s. 
//
// You must do this by modifying the input array in-place with O(1) extra 
//memory. 
//
// 
// Example 1: 
// Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
// 
// Example 2: 
// Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁵ 
// s[i] is a printable ascii character. 
// 
//
// Related Topics Two Pointers String 👍 9004 👎 1195


package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class ReverseString {
    public static void main(String[] args) {
        Solution solution = new ReverseString().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void reverseString(char[] s) {
            if (s.length == 1) {
                return;
            }

            int n = s.length;
            for (int i = 0; i < n / 2; i++) {
                char t = s[i];
                s[i] = s[n - 1 - i];
                s[n - 1 - i] = t;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}