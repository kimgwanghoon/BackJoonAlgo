import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] split = s.split(" ");
        if(split.length == 0){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if(split[i].equals("")){
                sb.append(" ");
                continue;
            }
            sb.append(split[i].substring(0, 1).toUpperCase() + split[i].substring(1).toLowerCase()).append(" ");
        }
        if (s.toString().substring(s.length() - 1, s.length()).equals(" ")) {
            return sb.toString();
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}