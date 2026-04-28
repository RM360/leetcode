package leetcode.groupanagrams;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        // 各文字列を「ソートしてキー化」
        List<String> list = new ArrayList<>();
        for (String s : strs) {
            // sをアルファベット順に並べ替える
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            // →Map<キー, List<String>> に追加
//            if(!map.containsKey(key)){
//                map.put(key, new ArrayList<>());
//            }
//            map.get(key).add(s);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
