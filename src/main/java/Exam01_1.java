public class Exam01_1 {
    public static void main(String[] args) {

        String a = "*";

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(4-i)*2+1; j++) {

                System.out.print(a);
            }
            System.out.println();
        }
    }
}