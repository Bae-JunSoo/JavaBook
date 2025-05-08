import java.util.Scanner; // 사용자 입력을 받기 위한 Scanner 클래스 불러오기

public class Exam01_1_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);// Scanner 객체 생성

        System.out.print("최대 별 개수 (홀수): ");
        int a = s.nextInt(); // 사용자로부터 별의 최대 개수 입력받기

        int rows = (a + 1) / 2; // 줄 수 계산 (예: 9 → 5줄)

        // 줄 수만큼 반복
        for (int i = 1; i <= rows; i++) {

            // 공백 출력: 가운데 정렬을 위해 필요
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // 별 출력: (2 * i - 1) 개
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈
        }

        s.close(); // Scanner 닫기
    }
}
