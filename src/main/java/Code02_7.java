public class Code02_7 {
    public static void main(String[] args) {

        int a;
        double b;
        String c;

        c = "1234";
        a = Integer.parseInt(c);
        System.out.println("문자열 ==> 정수 : " + a);

        c = "3.14";
        b = Double.parseDouble(c);
        System.out.println("문자열 ==> 실수 : " + b);

    }
}
