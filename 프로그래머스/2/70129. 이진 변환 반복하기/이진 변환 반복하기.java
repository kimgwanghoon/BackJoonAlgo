class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String DEL_ZERO = "0";
        while (s.length() != 1) {
            answer[0] += 1;
            int length = s.length();
            s = s.replaceAll(DEL_ZERO, "");
            answer[1] += length - s.length();
            s = Integer.toBinaryString(s.length());
        }
        return answer;
    }
}