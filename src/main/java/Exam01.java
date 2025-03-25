import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a, b;
        double c;

        System.out.print("정수 :");
        a = s.nextInt();
        System.out.print("정수 :");
        b = s.nextInt();

        c = (double) a / b;
        System.out.println(a + "/" + b + "=" + c);
    }
}
