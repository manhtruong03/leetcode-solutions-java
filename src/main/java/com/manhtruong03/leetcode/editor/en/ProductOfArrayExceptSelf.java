// Given an integer array nums, return an array answer such that answer[i] is
// equal to the product of all the elements of nums except nums[i].
//
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
// integer.
//
// You must write an algorithm that runs in O(n) time and without using the
// division operation.
//
//
// Example 1:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
//
// Example 2:
// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]
//
//
// Constraints:
//
//
// 2 <= nums.length <= 10⁵
// -30 <= nums[i] <= 30
// The input is generated such that answer[i] is guaranteed to fit in a 32-bit
// integer.
//
//
//
// Follow up: Can you solve the problem in O(1) extra space complexity? (The
// output array does not count as extra space for space complexity analysis.)
//
// Related Topics Array Prefix Sum 👍 24217 👎 1558

package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class ProductOfArrayExceptSelf {
  public static void main(String[] args) {
    Solution solution = new ProductOfArrayExceptSelf().new Solution();
    solution.productExceptSelf(new int[] {1, 2, 3, 4});
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] ans = new int[nums.length];
      int prefix = 1;
      int suffix = 1;

      for (int i = 0; i < nums.length; i++) {
        ans[i] = prefix;
        prefix *= nums[i];
      }

      for (int i = nums.length - 1; i >= 0; i--) {
        ans[i] *= suffix;
        suffix *= nums[i];
      }

      return ans;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
