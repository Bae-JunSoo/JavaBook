import java.util.Scanner;

public class backjun5523 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int A = 0;
        int B = 0;

        for (int i = 1; i <= a; i++) {
            int b = s.nextInt();
            int c = s.nextInt();
            if(b > c){
               A += 1;
            }else if(b < c){
                B += 1;
            } else {

            }
        }

        System.out.println(A + " " + B);
    }
}
