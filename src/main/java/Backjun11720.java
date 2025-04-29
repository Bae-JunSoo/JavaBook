import java.util.Scanner;

public class Backjun11720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int b = s.nextInt();
        String a = s.next();
        int c = 0;

        for (int i = 0; i < b; i++) {

           c += Integer.parseInt(a.substring(i,i+1));
        }

        System.out.println(c);



    }
}
