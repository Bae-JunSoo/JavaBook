import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        double c = (double)a/b ;

        System.out.println(a + "/" + b + "=" + c);
        s.close();
    }
}
