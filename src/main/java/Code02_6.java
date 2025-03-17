import java.util.Scanner;

public class Code02_6 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        double a;
        System.out.print("실수를 입력하세요 :");
        a = s.nextDouble();
        System.out.println("사용자가 입력한 값 ==>" + a);

        String b;
        System.out.print("문자열을 입력하세요 :");
        b = s.next();
        System.out.println("사용자가 입력한 값 ==>" + b);
        s.close();

    }
}
