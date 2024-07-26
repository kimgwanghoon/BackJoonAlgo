import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        if (Integer.parseInt(a[0]) < Integer.parseInt(a[1])) {
            System.out.println("<");
        } else if (Integer.parseInt(a[0]) > Integer.parseInt(a[1])) {
            System.out.println(">");
        } else {
            System.out.println("==");
        }
    }
}