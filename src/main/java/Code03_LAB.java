import java.util.Scanner;

public class Code03_LAB {
    public static void main(String[] args){

        /* 헬스장 덤벨의 무게는 킬로그램(KG)이 아닌 파운드(lb)로 표시되어 있다.
           덤벨의 무게를 쉽게 파악할 수 있도록 파운드와 킬로그램을 상호 변환하는 프로그램을 만들어라
         */

        double pound, kg;
        Scanner s = new Scanner(System.in);

        System.out.print("파운드 값을 입력하세요 : ");
        pound = s.nextDouble();
        kg = pound * 0.453592;
        kg = Math.round(kg * 100.0) / 100.0;            /* 소수점 아래 숫자가 너무 길면 소수점 아래 자릿수 지정 */
        System.out.println(pound + "파운드(lb)는 " + kg + "킬로그램(kg)입니다." );

        System.out.print("킬로그램(kg) 값을 입력하세요 : ");
        kg = s.nextDouble();
        pound = kg * 2.20462;
        System.out.println(kg + "킬로그램(kg)는 " + pound + "파운드(lb)입니다." );

        s.close();

    }
}
