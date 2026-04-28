package leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int x = nums[i];
            int need = target - x ;

            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }

            /* xをmapに登録（valueはi） */
            map.put(x,i);
        }
        return null;
    }
}