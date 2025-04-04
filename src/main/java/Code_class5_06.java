import java.util.Scanner;

public class Code_class5_06 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("1~3 중에 선택하세요 : ");
        a = s.nextInt();

        switch (a) {
            case 1:
                System.out.println("1을 선택했습니다.");
                break;
            case 2:
                System.out.println("2를 선택했습니다.");
                break;
            case 3:
                System.out.println("3을 선택했습니다");
                break;
            default:          // case가 모두 아닐 경우
                System.out.println("이상한 것을 선택했습니다.");
        }
        s.close();
    }
}
