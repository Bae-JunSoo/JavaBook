public class Code03_LAB3_1 {
    public static void main(String[] args) {

        int java = 3, mobile = 2, excel = 1;
        double A = 4.5, A0 = 4.0, B = 3.5;

        double c;

        c = ((java*B) + (mobile*A0) + (excel*A)) / (java + mobile + excel);
        c = Math.round(c * 100) / 100.0;

        System.out.println("평균 학점 : " + c);


    }
}
