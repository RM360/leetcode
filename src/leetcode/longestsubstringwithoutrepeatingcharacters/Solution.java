package leetcode.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {

            while (!set.add(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            System.out.println("left=" + left + ", i=" + i + ", set=" + set);
            // max更新
            if (set.size() > max) {
                max = set.size();
            }
        }

        return max;
    }
}