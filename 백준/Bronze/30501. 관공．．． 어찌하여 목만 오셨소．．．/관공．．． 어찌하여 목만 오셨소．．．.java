import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> names = new ArrayList();
        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }
        names.stream().forEach(name -> {
            if (name.contains("S")){
                System.out.println(name);
            }
        });
    }
}