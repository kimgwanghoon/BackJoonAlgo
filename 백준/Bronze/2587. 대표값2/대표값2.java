import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            nums.add(sc.nextInt());
        }
        int avg = nums.stream().mapToInt(Integer::intValue).sum() / 5;
        Collections.sort(nums);
        System.out.println(avg);
        System.out.println(nums.get(2));
    }
}