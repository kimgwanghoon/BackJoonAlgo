class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            int total = 0;
            int temp = i;
            while (total <= n) {
                total += temp;
                temp++;
                if (total == n) {
                    answer++;
                    break;
                }
            }
        }
        answer++;
        return answer;
    }
}