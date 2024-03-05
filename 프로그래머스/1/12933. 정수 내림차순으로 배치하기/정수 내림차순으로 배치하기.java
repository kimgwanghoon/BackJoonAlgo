import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());
        long result = Long.parseLong(String.join("", list));
        
        return result;
    }
}