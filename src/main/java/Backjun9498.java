import java.util.Scanner;

public class Backjun9498 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (90 <= a && a <= 100){
            System.out.println("A");
        }else if (80 <= a){
            System.out.println("B");
        }else if (70 <= a){
            System.out.println("C");
        }else if (60 <= a){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        s.close();
    }
}
