import java.util.Scanner;

public class Code_class6_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int hap = 0;
        int num, num2;

        while (true) {
            System.out.print("숫자 ==> ");
            num = s.nextInt();
            if (num == 0)
                break;
            System.out.print("숫자2 ==> ");
            num2 = s.nextInt();

            hap = num + num2;
            System.out.println(num + " + " +  num2 + " = " + hap);
        }
    }
}
