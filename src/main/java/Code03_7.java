import java.util.Scanner;

public class Code03_7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a;

        System.out.print("면허시험 점수 : ");
        a = s.nextInt();
        System.out.println(a >= 70);

        s.close();
    }
}
