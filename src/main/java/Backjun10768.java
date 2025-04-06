import java.util.Scanner;

public class Backjun10768 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int m, d;

        m = s.nextInt();
        d = s.nextInt();

        if (m > 2) {
            System.out.print("After");
        } else if (m < 2) {
            System.out.print("Before");
        } else {
            if (d > 18) {
                System.out.print("After");
            } else if (d < 18) {
                System.out.print("Before");
            } else {
                System.out.print("Special");
            }
        }
        s.close();
    }
}
