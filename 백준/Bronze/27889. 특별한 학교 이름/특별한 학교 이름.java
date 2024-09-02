import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String school = sc.nextLine();
        if ("NLCS".equals(school)) {
            System.out.println("North London Collegiate School");
        } else if ("BHA".equals(school)) {
            System.out.println("Branksome Hall Asia");
        } else if ("KIS".equals(school)) {
            System.out.println("Korea International School");
        } else if ("SJA".equals(school)) {
            System.out.println("St. Johnsbury Academy");
        }
    }
}