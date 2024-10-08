import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> setResult = new HashSet<>();
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = i; j < elements.length + i; j++) {
                sum += elements[j % elements.length];
                setResult.add(sum);
            }
        }

        return setResult.size();
    }
}