import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String diceNums = sc.nextLine();

        int[] dice = Arrays.stream(diceNums.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            System.out.println(10000 + dice[0] * 1000);
        } else if (dice[0] == dice[1] || dice[1] == dice[2]) {
            System.out.println(1000 + dice[1] * 100);
        } else {
            System.out.println(dice[2] * 100);
        }
    }
}