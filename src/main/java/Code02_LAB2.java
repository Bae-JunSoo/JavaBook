import java.util.Scanner;

public class Code02_LAB2 {
    public static void main(String[] args) {

        /*사용자가 키보드로 두 정수를 입력하면 더하기, 빼기, 곱하기, 나누기, 나머지 연산을 하는 계산기 만들기 */

        int a, b, c;
        double C;
        Scanner s = new Scanner(System.in);

        System.out.print("정수1을 입력하세요 : " );
        a = s.nextInt();
        System.out.print("정수2를 입력하세요 : " );
        b = s.nextInt();

        c = a + b;
        System.out.println(a + "+" + b + "=" + c);

        c = a - b;
        System.out.println(a + " - " + b + "=" + c);

        c = a * b;
        System.out.println(a + " * " + b + "=" + c);

        C = (double) a / b;                              /* 나누기의 나머지를 지정하기 위한 실수형 변수로 변경*/
        System.out.println(a + " / " + b + "=" + C);

        c = a % b;
        System.out.println(a + " % " + b + "=" + c);

        s.close();

    }
}
