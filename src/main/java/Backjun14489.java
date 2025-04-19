import java.util.Scanner;

public class Backjun14489 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a, b, c, res;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        res = a + b;

        if (res >= c*2){
            System.out.println(res - c*2);
        }else {
            System.out.println(res);
        }
        s.close();
    }
}
