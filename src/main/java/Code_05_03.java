import java.util.Scanner;

public class Code_05_03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;

        a = s.nextInt();

        if (a < 100) {
            System.out.println("100보다 작군요.");
            System.out.println("여기는 참입니다.");
        } else {
            System.out.println("100보다 크군요.");
            System.out.println("여기는 거짓입니다.");
        }
    }
}
