import java.util.Scanner;

public class Code_class3_2 {
    public static void main(String[] args) {
        /* 두 수를 이용한 계산기 */

        int a, b;
        double c;
        Scanner s = new Scanner(System.in);

        System.out.print("첫번째 값 : ");
        a = s.nextInt();
        System.out.print("두번째 값 : ");
        b = s.nextInt();

        c = a + b;
        System.out.println(a + "+" + b + "=" + c);

        c = a - b;
        System.out.println(a + " - " + b + "=" + c);

        c = a * b;
        System.out.println(a + " * " + b + "=" + c);

        c = (double) a / b;
        System.out.println(a + " / " + b + "=" + c);

        c = a % b;
        System.out.println(a + " % " + b + "=" + c);

        s.close();
    }
}

