//A phrase is a palindrome if, after converting all uppercase letters into 
//lowercase letters and removing all non-alphanumeric characters, it reads the same 
//forward and backward. Alphanumeric characters include letters and numbers. 
//
// Given a string s, return true if it is a palindrome, or false otherwise. 
//
// 
// Example 1: 
//
// 
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
// 
//
// Example 2: 
//
// 
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric 
//characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
//
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// s consists only of printable ASCII characters. 
// 
//
// Related Topics Two Pointers String 👍 10383 👎 8549


package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution solution = new ValidPalindrome().new Solution();
        boolean answer = solution.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(answer);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            int left = 0, right = s.length() - 1;
            while (left < right) {
                char leftChar = s.charAt(left);
                char rightChar = s.charAt(right);
                boolean isLeftOk = Character.isLetterOrDigit(leftChar);
                boolean isRightOk = Character.isLetterOrDigit(rightChar);

                if (!isLeftOk) {
                    left++;
                }
                if (!isRightOk) {
                    right--;
                }
                if (isLeftOk && isRightOk) {
                    if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                        return false;
                    }
                    left++;
                    right--;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}