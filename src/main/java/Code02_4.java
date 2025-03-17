public class Code02_4 {
    public static void main(String[] args) {
        int number1 = 10,  number2 = 20;
        int resAdd;
        int resSub;
        int resMul;
        double resDiv; /* int = 정수 , double 실수 */

        resAdd = number1 + number2;                            /* 정수 (기호) 정수 = 정수 */
        resSub = number1 - number2;
        resMul = number1 * number2;
        resDiv = (double) number1 / number2;                   /* 실수 (기호) 정수 = 실수 */

        System.out.println(number1 + " + " + number2 + " = " + resAdd);
        System.out.println(number1 + " - " + number2 + " = " + resSub);
        System.out.println(number1 + " * " + number2 + " = " + resMul);
        System.out.println(number1 + " / " + number2 + " = " + resDiv);
    }
}
