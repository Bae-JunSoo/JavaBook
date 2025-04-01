import java.util.Scanner;

public class Backjun1330 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int A, B;

        A = s.nextInt();
        B = s.nextInt();

        if(A > B) {
            System.out.print(">");
        } else if(A < B) {
            System.out.print("<");
        } else if(A == B) {
            System.out.print("==");
        }
        s.close();
    }
}
