// Given an integer array nums, find three numbers whose product is maximum and
// return the maximum product.
//
//
// Example 1:
// Input: nums = [1,2,3]
// Output: 6
//
// Example 2:
// Input: nums = [1,2,3,4]
// Output: 24
//
// Example 3:
// Input: nums = [-1,-2,-3]
// Output: -6
//
//
// Constraints:
//
//
// 3 <= nums.length <= 10⁴
// -1000 <= nums[i] <= 1000
//
//
// Related Topics Array Math Sorting 👍 4382 👎 705

package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class MaximumProductOfThreeNumbers {
  public static void main(String[] args) {
    Solution solution = new MaximumProductOfThreeNumbers().new Solution();
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int maximumProduct(int[] nums) {
      int n = nums.length;
      for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
          if (Math.abs(nums[j]) > Math.abs(nums[minIndex])) {
            minIndex = j;
          }
        }
        int t = nums[minIndex];
        nums[minIndex] = nums[i];
        nums[i] = t;
      }

      int ans = 1;
      for (int i = 0; i < 3; i++) {
        ans *= nums[i];
      }

      return ans;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
