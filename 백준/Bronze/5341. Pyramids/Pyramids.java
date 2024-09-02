import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> results = new ArrayList();
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            int result = (num + 1) * num / 2;
            results.add(result);
        }
        results.forEach(System.out::println);
    }
}