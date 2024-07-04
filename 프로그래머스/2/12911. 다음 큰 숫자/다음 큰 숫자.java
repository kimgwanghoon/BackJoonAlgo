class Solution {
    public int solution(int n) {
        String binary = Integer.toBinaryString(n);
        int count = countOnesInBinary(binary);

        int answer = n+1;
        while (true) {
            String binary1 = Integer.toBinaryString(answer);
            int count1 = countOnesInBinary(binary1);
            if (count == count1) {
                break;
            }
            answer++;
        }

        return answer;
    }
    
    private static int countOnesInBinary(String binary) {
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}