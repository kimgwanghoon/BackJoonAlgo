import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String[] result = new String[test];
        for (int i = 0; i < test; i++) {
            int num = sc.nextInt();
            if ((num & (-num)) == num) {
                result[i] = "1";
                continue;
            }
            result[i] = "0";
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}