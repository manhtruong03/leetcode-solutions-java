// You have a long flowerbed in which some of the plots are planted, and some
// are not. However, flowers cannot be planted in adjacent plots.
//
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty
// and 1 means not empty, and an integer n, return true if n new flowers can be
// planted in the flowerbed without violating the no-adjacent-flowers rule and false
// otherwise.
//
//
// Example 1:
// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
//
// Example 2:
// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false
//
//
// Constraints:
//
//
// 1 <= flowerbed.length <= 2 * 10⁴
// flowerbed[i] is 0 or 1.
// There are no two adjacent flowers in flowerbed.
// 0 <= n <= flowerbed.length
//
//
// Related Topics Array Greedy 👍 7041 👎 1283

package com.manhtruong03.leetcode.editor.en;

import java.util.*;
import java.io.*;

public class CanPlaceFlowers {
  public static void main(String[] args) {
    Solution solution = new CanPlaceFlowers().new Solution();
    List<int[]> testCases_1 = new ArrayList<>();
		List<Integer> testCases_2 = new ArrayList<>();

//	  testCases_1.add(new int[]{1,0,0,0,1});
//	  testCases_2.add(2);

	  testCases_1.add(new int[]{1,0,0,0,0,1});
	  testCases_2.add(2);

		for (int i = 0; i < testCases_1.size(); i++) {
			int[] flowerbed = testCases_1.get(i);
			int n = testCases_2.get(i);

      System.out.printf("intput:[%s] | %s%n", Arrays.toString(flowerbed), n);
      System.out.printf("output:%s%n", solution.canPlaceFlowers(flowerbed, n));
		}
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
      int lastIndex = -2;
      int count = 0;

      for (int i = 0; i < flowerbed.length; i++) {
        if (flowerbed[i] == 1) {
          if (i - 1 == lastIndex) {
            count--;
          }
          lastIndex = i;
        }

        if (flowerbed[i] == 0 && i - 2 >= lastIndex) {
          lastIndex = i;
          count++;
        }
      }

      return count >= n;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
