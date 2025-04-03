import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();
        String c = (a + b).toLowerCase().replaceAll(" ", "");

        System.out.println(c);

        s.close();
    }
}
