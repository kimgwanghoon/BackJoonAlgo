import java.util.Map;

class Solution {
    
    private static final Map<String, String> numberMap = Map.of(
		"one", "1", "two", "2", "three", "3", "four", "4",
		"five", "5", "six", "6", "seven", "7", "eight", "8",
		"nine", "9", "zero", "0"
	);
    
    public int solution(String s) {
        return Integer.parseInt(numberMap.keySet().stream().reduce(s, (str, key) -> str.replaceAll(key, numberMap.get(key))));
    }
}