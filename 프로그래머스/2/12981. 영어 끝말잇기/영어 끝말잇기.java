import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        char lastWord = words[0].charAt(words[0].length() - 1);
        for (int i = 1; i < words.length; i++) {
            answer[0] = i % n + 1;
            answer[1] = i / n + 1;
            if (words[i].charAt(0) == lastWord && !set.contains(words[i])) {
                lastWord = words[i].charAt(words[i].length() - 1);
                set.add(words[i]);
                continue;
            }
            break;
        }
        if (set.size() == words.length) {
            answer[0] = 0;
            answer[1] = 0;
            return answer;
        }
        return answer;
    }
}