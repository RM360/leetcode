package leetcode.containsduplicate;


public class Main {
    static void main(String[] args) {
        Solution sol = new Solution();

        boolean res = sol.containsDuplicate(new int[]{1,2,3,1});
//        boolean res = sol.containsDuplicate(new int[]{1,2,3,4});
//        boolean res = sol.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        System.out.println(res);
    }
}
