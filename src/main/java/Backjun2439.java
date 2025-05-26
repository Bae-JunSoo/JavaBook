import java.util.Scanner;

public class Backjun2439 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j > a - i) {
                        System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
