class Solution {
    public boolean solution(String s) {
        if (lengthCheck(s)) {
            return false;
        }
        
        String pattern = "^[\\d]*$";
        if (!s.matches(pattern)) {
            return false;
        }
        
        return true;
    }
    
    public boolean lengthCheck(String s) {        
        if(s.length() == 4) {
            return false;
        }
        if(s.length() == 6) {
            return false;
        }
        return true;
    }
}