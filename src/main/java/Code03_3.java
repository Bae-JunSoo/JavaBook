public class Code03_3 {
    public static void main(String[] args){

        int a = 3, b = 4, c = 5;

        System.out.println(a + b - c);   /* 계산 순서 : 수학의 사칙연산개념과 동일 */
        System.out.println(a - c + b);
        System.out.println(-c + a + b);

        System.out.println(a * b + c);   /* 역시 곱셈부터 계산 */
        System.out.println(a + b * c);
    }
}
