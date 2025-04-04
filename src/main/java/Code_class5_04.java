import java.util.Scanner;

public class Code_class5_04 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a > 100) {
            if (a < 1000) {
                System.out.println("100보다 크고 1000보다 작군요.");
            } else {
                System.out.println("와~ 1000보다 크군요.");
            }
        } else {
            System.out.print("음~ 100보다 작군요.");
        }
        s.close();
    }
}
