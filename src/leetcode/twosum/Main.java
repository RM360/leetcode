package leetcode.twosum;

import java.util.*;

public class Main {
    static void main(String[] args) {
        Solution sol = new Solution();

//        int[] res = sol.twoSum(new int[]{3,2,4,}, 6);
        int[] res = sol.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(res));
    }
}