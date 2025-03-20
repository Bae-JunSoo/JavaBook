public class Code03_4 {
    public static void main(String[] args) {

        /* Math 함수 : 제곱 연산 Math.pow(밑수, 지수);
                종류 : Math.abs(): 절대값
                ㅡㅡ : Math.log(): 로그값
                ㅡㅡ : Math.max(): 최댓값
                ㅡㅡ : Math.min(): 최솟값
                ㅡㅡ : Math.(sin, cos, tan)(): 삼각함수
         */


        double a, b;

        /* Math 함수의 결과값은 실수로 표기 되기에 변수값을 double로 지정해야함 */

        a = Math.pow(3, 2);
        System.out.println(a);

        b = Math.pow(4, 3);
        System.out.println(b);
    }
}
