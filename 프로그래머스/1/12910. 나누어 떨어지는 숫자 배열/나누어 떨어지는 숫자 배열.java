import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr).filter(factor -> factor % divisor == 0).sorted().toArray();

        if (result.length == 0) {
            result = new int[]{-1};
        }
        return result;
    }
}