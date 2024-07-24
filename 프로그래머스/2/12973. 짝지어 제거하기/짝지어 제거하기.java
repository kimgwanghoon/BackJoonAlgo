import java.util.Stack;

class Solution {
    public int solution(String s) {
        char[] chars = s.toCharArray();
        Stack stack = new Stack();
        for (char c : chars) {
            if (stack.isEmpty()){
                stack.push(c);
                continue;
            }
            if (stack.peek().equals(c)){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}