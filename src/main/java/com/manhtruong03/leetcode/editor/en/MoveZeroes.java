//Given an integer array nums, move all 0's to the end of it while maintaining 
//the relative order of the non-zero elements. 
//
// Note that you must do this in-place without making a copy of the array. 
//
// 
// Example 1: 
// Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
// 
// Example 2: 
// Input: nums = [0]
//Output: [0]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//Follow up: Could you minimize the total number of operations done?
//
// Related Topics Array Two Pointers 👍 17921 👎 526


package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
        solution.moveZeroes(new int[]{0,1,0,3,12});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveTo(int[] nums, int start, int target) {
            int value = nums[start];
            for (int i = start; i < target; i++) {
                nums[i] = nums[i + 1];
            }
            nums[target] = value;
        }

        public void moveZeroes(int[] nums) {
            int endIndex = nums.length - 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == 0 && i != endIndex) {
                    moveTo(nums, i, endIndex--);
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}