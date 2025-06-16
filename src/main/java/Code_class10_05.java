public class Code_class10_05 {
    static int para3_method(int a, int b, int c) {
        int result = 0;
        result = a +  b + c;
        return result;
    }
    public static void main(String[] args) {
        int hap;
        hap = para3_method(10, 20, 30);
        System.out.println("매개변수 3개 메서드 호출 결과 ==> "  + hap);
    }
}
//