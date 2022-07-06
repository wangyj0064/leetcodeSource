package com.leetcode.solution.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * English Version
 *
 * 题目描述
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 *
 * 提示：
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
 *
 * 解法
 * 用哈希表（字典）存放数组值以及对应的下标。
 *
 * 遍历数组，当发现 target - nums[i] 在哈希表中，说明找到了目标值。
 */
public class TwoSum {

    public static int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i){
            int num = target - nums[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,7,8};
        int target = 10;
        twosum(nums, target);
    }

}
