package my.home.leetcode;

public class TwoSum {

    /*

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        */


    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (target - nums[j] == nums[i] && i != j) {
                    arr = new int[]{i, j};
                }
            }
        }
        return arr;
    }
}
