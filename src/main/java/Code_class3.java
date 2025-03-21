public class Code_class3 {
    public static void main(String[] args) {

        int num1, num2, result;
        num1 = 100;
        num2 = 60;

        float res, res2;

        result = num1 / num2;                        /* 정수 + 정수 = 정수 */
        res = num1 / num2;                           /* 정수 + 정수 = 실수(정수.0) */
        res2 = (float) num1 / num2;                  /* 정수 + 정수 ->(실수) = 실수 */

        /* = 가 나오기 전에 반드시 형태를 바꿔라 ex) res2 = (float) num1 / num2; */

        System.out.println(num1 + "/" + num2 + "=" + result);
        System.out.println(num1 + "/" + num2 + "=" + res);
        System.out.println(num1 + "/" + num2 + "=" + res2);
    }
}
