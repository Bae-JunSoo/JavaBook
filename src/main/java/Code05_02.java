import java.util.Scanner;

public class Code05_02 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("숫자 입력 : ");
        a = s.nextInt();

        if(a > 100){
            System.out.print("100보다 큽니다.");
        } else {
            System.out.print("100보다 작습니다.");
        }
    }
}
