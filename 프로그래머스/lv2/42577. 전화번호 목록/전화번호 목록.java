import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = Arrays.stream(phone_book).collect(HashSet::new, (m, v) -> {m.add(v);}, HashSet::addAll);
        for(String phone : phone_book){
            for (int i = 1; i < phone.length(); i++) {
                if (set.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }
}