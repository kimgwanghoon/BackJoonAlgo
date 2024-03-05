import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int half = nums.length / 2;
        int[] removeDup = Arrays.stream(nums).distinct().toArray();
        if (removeDup.length > half) {
            return half;
        }
        return removeDup.length;
    }
}