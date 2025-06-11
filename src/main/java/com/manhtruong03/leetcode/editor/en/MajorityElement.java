//Given an array nums of size n, return the majority element. 
//
// The majority element is the element that appears more than ⌊n / 2⌋ times. 
//You may assume that the majority element always exists in the array. 
//
// 
// Example 1: 
// Input: nums = [3,2,3]
//Output: 3
// 
// Example 2: 
// Input: nums = [2,2,1,1,1,2,2]
//Output: 2
// 
// 
// Constraints: 
//
// 
// n == nums.length 
// 1 <= n <= 5 * 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
//
// 
//Follow-up: Could you solve the problem in linear time and in 
//O(1) space?
//
// Related Topics Array Hash Table Divide and Conquer Sorting Counting 👍 20985 
//👎 737


package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new MajorityElement().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> frequency = new HashMap<>();
            for (int num : nums) {
                int newValue = frequency.getOrDefault(num, 0) + 1;
                frequency.put(num, newValue);
            }

            int result = 0;
            int maxFrequency = -1;
            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (maxFrequency <= entry.getValue()) {
                    maxFrequency = entry.getValue();
                    result = entry.getKey();
                }
            }

            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}