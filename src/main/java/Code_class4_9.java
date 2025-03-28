public class Code_class4_9 {
    public static void main(String[] args) {

        String str = "    한글    ABCD    efgh  ";
        String cutstr = "";
        String restr = "";
        boolean res;

        cutstr = str.trim();
        restr = str.replaceAll(" ", "");  // 원하는 글자 제거
        res = str.isEmpty(); // 문자열에 값이 존재하는지 체크
        boolean res2 = str.length() == 0; //옛날 11열 코딩방식

        System.out.println(cutstr);
        System.out.println(restr);
        System.out.println(res);
        System.out.println(res2);
        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("공백 제거  ==> [" + cutstr + "]");
    }
}
