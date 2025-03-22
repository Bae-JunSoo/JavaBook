public class Code03_5 {
    public static void main(String[] args) {
        int a;

        a = 100;
        a = 100 + 200;
        a = a + 200;
        a += 200;


        a = Integer.parseInt("100") + Integer.parseInt("200");
        /* Integer.parseInt / double.parsedouble
           = 문자를 수로 바꾸는 식
         */
        System.out.println(a);

        /* a = a + 200  ==> a += 200
           a = a - 200  ==> a -= 200
           이하 모든 등호
         */
    }
}
