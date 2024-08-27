import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        int hour = Integer.parseInt(nums.split(" ")[0]);
        int min = Integer.parseInt(nums.split(" ")[1]);

        if (min >= 45) {
            System.out.println(hour + " " + (min - 45));
        } else if (hour == 0) {
            System.out.println(23 + " " + (min + 15));
        } else {
            System.out.println((hour - 1) + " " + (min + 15));
        }
    }
}