//Given an integer array nums, return true if any value appears at least twice 
//in the array, and return false if every element is distinct. 
//
// 
// Example 1: 
//
// 
// Input: nums = [1,2,3,1] 
// 
//
// Output: true 
//
// Explanation: 
//
// The element 1 occurs at the indices 0 and 3. 
//
// Example 2: 
//
// 
// Input: nums = [1,2,3,4] 
// 
//
// Output: false 
//
// Explanation: 
//
// All elements are distinct. 
//
// Example 3: 
//
// 
// Input: nums = [1,1,1,3,3,4,3,2,4,2] 
// 
//
// Output: true 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
//
// Related Topics Array Hash Table Sorting 👍 12907 👎 1330


package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution solution = new ContainsDuplicate().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean containsDuplicate(int[] nums) {
			if (nums.length == 1) {
				return false;
			};

			Set<Integer> set = new HashSet<>();
			for (int num : nums) {
				if (!set.add(num)) {
					return true;
				}
			}

			return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}