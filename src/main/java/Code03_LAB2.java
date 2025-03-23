import java.util.Scanner;

public class Code03_LAB2 {
    public static void main(String[] args) {

        // 편의점에서 취급하는 물품의 구입 가격과 판매 가격이 다음과 같을 때, 오늘의 총 매출액의을 계산하는 프로그램을 만들어 봅시다. //
        Scanner s = new Scanner(System.in);
        Scanner b = new Scanner(System.in);

        int coffee, kimbab, milk, rice, coke, snack;
        int total, buy, sell;

        total = 0;
        coffee = 500;
        kimbab = 900;
        milk = 800;
        rice = 3500;
        coke = 700;
        snack = 1000;

        System.out.println("오늘의 구입량 갯수");
        System.out.print("커피 : ");
        buy = b.nextInt();
        total -= coffee * buy;
        System.out.print("김밥 : ");
        buy = b.nextInt();
        total -= kimbab * buy;
        System.out.print("우유 : ");
        buy = b.nextInt();
        total -= milk * buy;
        System.out.print("도시락 : ");
        buy = b.nextInt();
        total -= rice * buy;
        System.out.print("콜라 : ");
        buy = b.nextInt();
        total -= coke * buy;
        System.out.print("과자 : ");
        buy = b.nextInt();
        total -= snack * buy;

        System.out.println("-------------------------");

        coffee = 1800;
        kimbab = 1400;
        milk = 1800;
        rice = 4000;
        coke = 1500;
        snack = 2000;

        System.out.println("오늘의 판매량 갯수");
        System.out.print("커피 : ");
        sell = s.nextInt();
        total += coffee * sell;
        System.out.print("김밥 : ");
        sell = s.nextInt();
        total += kimbab * sell;
        System.out.print("우유 : ");
        sell = s.nextInt();
        total += milk * sell;
        System.out.print("도시락 : ");
        sell = s.nextInt();
        total += rice * sell;
        System.out.print("콜라 : ");
        sell = s.nextInt();
        total += coke * sell;
        System.out.print("과자 : ");
        sell = s.nextInt();
        total += snack * sell;

        s.close();
        b.close();

        System.out.println("오늘의 총매출액은 " + total + "원 입니다.");

    }
}

