class Solution {
    public int solution(int n) {
        int binary = Integer.bitCount(n);

        int answer = n+1;
        while (true) {
            int count = Integer.bitCount(answer);
            if (binary == count) {
                break;
            }
            answer++;
        }

        return answer;
    }
}