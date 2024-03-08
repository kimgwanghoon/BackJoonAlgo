import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution {
    public String solution(int a, int b) {
        LocalDate localDate = LocalDate.of(2016, a, b);
        return localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT_STANDALONE, Locale.US).toUpperCase();
    }
}