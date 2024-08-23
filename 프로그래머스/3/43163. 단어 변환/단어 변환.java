import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];

        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }

        queue.offer(begin);
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                String diff = queue.poll();
                if (diff.equals(target)) {
                    return answer;
                }

                for (int j = 0; j < words.length; j++) {
                    if (!visited[j] && convertCheck(diff, words[j])) {
                        visited[j] = true;
                        queue.offer(words[j]);
                    }
                }
            }
            answer++;
        }

        return 0;
    }
    
    public boolean convertCheck(String begin, String target) {
        int countDiff = 0;
        for (int i = 0; i < begin.length(); i++) {
            if (begin.charAt(i) != target.charAt(i)) {
                countDiff++;
            }
            if (countDiff > 1) {
                return false;
            }
        }
        return countDiff == 1;
    }
}