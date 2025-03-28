import java.util.Scanner;

public class Code_class4_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a, b;
        int diff;

        System.out.print("첫 번째 문자열 ==> ");
        a = s.nextLine();
        System.out.print("두 번째 문자열 ==> ");
        b = s.nextLine();

        diff = a.length() - b.length();
        System.out.println("두 문자열 길이의 차이는 " + diff + "입니다.");
        s.close();
    }
}
