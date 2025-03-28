public class Code_class4_9 {
    public static void main(String[] args) {

        String a = "    한글    ABCD    efgh  ";
        String b = "";

        b = a.trim();

        System.out.println("기존 문자열 ==> [" + a + "]");
        System.out.println("공백 제거  ==> [" + b + "]");
    }
}
