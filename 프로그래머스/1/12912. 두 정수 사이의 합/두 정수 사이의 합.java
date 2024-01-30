class Solution {
    public long solution(int a, int b) {
        if (a < b) {
            return integerSum(a, b);
        }
        if (a > b) {
            return integerSum(b, a);
        }
        return a;
    }
    
    public static long integerSum(int a, int b) {
        long answer = 0;
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}