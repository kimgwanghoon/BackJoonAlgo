import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clock = sc.nextLine();
        int ovenTime = sc.nextInt();
        int hour = Integer.parseInt(clock.split(" ")[0]);
        int min = Integer.parseInt(clock.split(" ")[1]);

        if (min + ovenTime >= 60) {
            hour += (min + ovenTime) / 60;
            min = (min + ovenTime) % 60;
            if (hour >= 24) {
                hour -= 24;
            }
        } else {
            min += ovenTime;
        }
        System.out.println(hour + " " + min);
    }
}