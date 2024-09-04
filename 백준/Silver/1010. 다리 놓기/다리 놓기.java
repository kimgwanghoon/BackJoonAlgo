import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] bridges = new String[count];
        
        for (int i = 0; i < count; i++) {
            bridges[i] = br.readLine();
        }

        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(bridges[i].split(" ")[0]);
            int b = Integer.parseInt(bridges[i].split(" ")[1]);
            int result = 1;
            for (int j = 1; j <= a; j++) {
                result = result * (b - j + 1) / j;
            }
            System.out.println(result);
        }
    }
}