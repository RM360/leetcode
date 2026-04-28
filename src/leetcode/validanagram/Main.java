package leetcode.validanagram;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      Solution sol = new Solution();

        boolean res = sol.isAnagram("anagram", "nagaram");
        System.out.println(res);
    }
}
