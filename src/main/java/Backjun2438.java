import java.util.Scanner;

public class Backjun2438 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        String b = "*";

        for (int i = 1; i <= a; i++) {
            System.out.println(b);
            b = b+ "*";
        }
    }
}
