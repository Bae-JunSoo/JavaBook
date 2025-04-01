import java.util.Scanner;

public class Code05_01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("숫자입력: ");
        a = s.nextInt();

        if( a > 100) {
            System.out.print("100보다 ");
            System.out.print("큽니다.");
        }
    }
}
