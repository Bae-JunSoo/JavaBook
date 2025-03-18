import java.util.Scanner;

public class Code02_LAB {
    public static void main(String[] args){

        /* 난생이가 택배를 보내려고 한다. 택배를 받는 사람의 이름과 주소, 택배의 무게를 입력해야한다.
           택배비는 g당 5원이며 자동 계산이 되는 프로그램을 만들어라
        */
        Scanner s = new Scanner(System.in);

        String a, b;
        double c;

        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ##");
        System.out.print("받는 사람 : ");
        a = s.next();

        System.out.print("주소 : ");
        b = s.next();

        System.out.print("무게(g) : ");
        c = s.nextDouble();

        System.out.println("받는 사람 : " + a);
        System.out.println("주소 : " + b);
        System.out.println("배송비 : " + (c*5) + "원");

        s.close();




    }
}
