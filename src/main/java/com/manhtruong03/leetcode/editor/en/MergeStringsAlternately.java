// You are given two strings word1 and word2. Merge the strings by adding
// letters in alternating order, starting with word1. If a string is longer than the
// other, append the additional letters onto the end of the merged string.
//
// Return the merged string.
//
//
// Example 1:
//
//
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
//
//
// Example 2:
//
//
// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b
// word2:    p   q   r   s
// merged: a p b q   r   s
//
//
// Example 3:
//
//
// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1:  a   b   c   d
// word2:    p   q
// merged: a p b q c   d
//
//
//
// Constraints:
//
//
// 1 <= word1.length, word2.length <= 100
// word1 and word2 consist of lowercase English letters.
//
//
// Related Topics Two Pointers String 👍 4520 👎 128

package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class MergeStringsAlternately {
  public static void main(String[] args) {
    Solution solution = new MergeStringsAlternately().new Solution();
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public String mergeAlternately(String word1, String word2) {
      StringBuilder ans = new StringBuilder();
      for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
        if (i < word1.length()) {
          ans.append(word1.charAt(i));
        }
        if (i < word2.length()) {
          ans.append(word2.charAt(i));
        }
      }

      return ans.toString();
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
