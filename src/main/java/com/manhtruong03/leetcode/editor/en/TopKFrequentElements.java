// Given an integer array nums and an integer k, return the k most frequent
// elements. You may return the answer in any order.
//
//
// Example 1:
// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
//
// Example 2:
// Input: nums = [1], k = 1
// Output: [1]
//
//
// Constraints:
//
//
// 1 <= nums.length <= 10⁵
// -10⁴ <= nums[i] <= 10⁴
// k is in the range [1, the number of unique elements in the array].
// It is guaranteed that the answer is unique.
//
//
//
// Follow up: Your algorithm's time complexity must be better than O(n log n),
// where n is the array's size.
//
// Related Topics Array Hash Table Divide and Conquer Sorting Heap (Priority
// Queue) Bucket Sort Counting Quickselect 👍 18324 👎 730

package com.manhtruong03.leetcode.editor.en;

import javax.imageio.plugins.tiff.TIFFDirectory;
import java.util.*;
import java.io.*;

public class TopKFrequentElements {
  public static void main(String[] args) {
    Solution solution = new TopKFrequentElements().new Solution();
    solution.topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2);
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int[] topKFrequent(int[] nums, int k) {

      Map<Integer, Integer> frequency = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
        frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
      }

      List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequency.entrySet());

      list.sort(Comparator.<Map.Entry<Integer, Integer>, Integer>comparing(Map.Entry::getValue).reversed());

      int[] answer = new int[k];

      for (int i = 0; i < k; i++) {
        answer[i] = list.get(i).getKey();
      }

      return answer;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
