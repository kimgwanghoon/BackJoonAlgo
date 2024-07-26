import java.util.Arrays;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                int width = yellow / i;
                int brownOuter = (width * 2) + (i * 2) + 4;
                if (brownOuter == brown) {
                    answer[0] = width + 2;
                    answer[1] = i + 2;
                    break;
                }
            }
        }

        return answer;
    }
}