package main.com.jse.lect14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TargetSum {

  public static int[] targetSumHelper(int[] nums, int target) {
    if (nums.length == 0) return new int[] {-1, -1};

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (map.containsKey(diff)) {
        return new int[] {i, map.get(diff)};
      } else map.put(nums[i], i);
    }

    return new int[] {-1, -1};
  }

  public static void main(String[] args) {
    int[] nums = {4, 5, -2, -5, 9, 8, 2};
    int[] result = new int[2];

    result = targetSumHelper(nums, -9);
    Arrays.stream(result).forEach(System.out::println);
  }
}
