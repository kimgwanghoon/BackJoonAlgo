import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(tangerine).forEach(i -> map.put(i, map.getOrDefault(i, 0) + 1));
        List<Integer> list = map.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for (int size : list) {
            if (k <= 0) {
                break;
            }
            k -= size;
            count++;
        }
        return count;
    }
}