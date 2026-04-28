package leetcode.groupanagrams;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        List<List<String>> res = sol.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(res);
    }
}
