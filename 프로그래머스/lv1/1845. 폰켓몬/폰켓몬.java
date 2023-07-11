import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numLength = nums.length;
        AtomicBoolean check = new AtomicBoolean(true);
        if(numLength < 1 && numLength > 10000 && (numLength % 2) != 0){
            return answer;
        }
        HashSet<Integer> set = Arrays.stream(nums).collect(HashSet::new, (m, v) -> {
            if (v < 1 || v > 200000) {
                check.set(false);
            } else {
                m.add(v);
            }
        }, HashSet::addAll);
        if(check.get()){
            answer = Integer.min(set.size(), numLength/2);
        }

        return answer;
    }
}