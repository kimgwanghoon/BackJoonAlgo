import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        Arrays.stream(arr).reduce((a, b) -> {
            if(a != b) {
                answer.add(b);
            }
            return b;
        });

        return answer.stream().mapToInt(i -> i).toArray();
    }
}