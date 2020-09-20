/*
 * @Descripttion: [1] 两数之和
 * @version: 1.0
 * @Author: Vincent
 * @Date: 2020-09-20 17:34:09
 * @LastEditors: Vincent
 * @LastEditTime: 2020-09-20 18:09:54
 */
package leetcode01;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * @name: 两数之和
     * @Author: Vincent
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) return nums;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
