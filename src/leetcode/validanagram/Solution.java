package leetcode.validanagram;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
//        最初の回答（しかもchatgptに聞いた）
//        Map<String, Integer> map = new HashMap<>();
//        for(int i = 0; i < s.length(); i++) {
//            map.put(s.substring(i,i+1), map.getOrDefault(s.substring(i,i+1), 0) + 1);
//        }
//        for(int i = 0; i < t.length(); i++) {
//            map.put(t.substring(i,i+1), map.getOrDefault(t.substring(i,i+1), 0) - 1);
//        }
//        for(int n: map.values()) {
//            if(n != 0) return false;
//        }
//        return true;

//        Map<Character, Integer> map = new HashMap<>();
//        for(int i = 0; i < s.length(); i++) {
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
//        }
//        for(int i = 0; i < t.length(); i++) {
//            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
//        }
//        for(int n: map.values()) {
//            if(n != 0) return false;
//        }
//        return true;

        int[] num =  new int[26];
        for(int i = 0; i < s.length(); i++){
            num[s.charAt(i) - 'a']++;
            num[t.charAt(i) - 'a']--;
        }
        for(int i: num){
            if(i != 0)
                return false;
        }
        return true;
    }
}
