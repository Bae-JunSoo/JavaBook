import java.util.Scanner;

public class Code03_LAB3 {
    public static void main(String[] args) {

        // 학점 계산기

        double java, mobile, excel, j, m, e;


        Scanner s = new Scanner(System.in);

        // 과목 점수 입력
        System.out.print("자바 : ");
        java = s.nextDouble();
        System.out.print("모바일 : ");
        mobile = s.nextDouble();
        System.out.print("엑셀 : ");
        excel = s.nextDouble();

        // 각 과목의 학점 계산
        j = getGradePoint(java);
        m = getGradePoint(mobile);
        e = getGradePoint(excel);

        // 평균 학점 계산
        double total = (j + m + e) / 3;
        total = Math.round(total * 10.0) / 10.0;  // 소수 첫째 자리까지 반올림

        System.out.println("평균 학점 : " + total);

        s.close();
    }

    // 학점 계산 함수
    public static double getGradePoint(double score) {
        if (score >= 90) {
            return 4.5;
        } else if (score >= 85) {
            return 4.0;
        } else if (score >= 80) {
            return 3.5;
        } else if (score >= 75) {
            return 3.0;
        } else if (score >= 70) {
            return 2.5;
        } else if (score >= 65) {
            return 2.0;
        } else if (score >= 60) {
            return 1.5;
        } else {
            return 0.0;  // F
        }
    }
}
