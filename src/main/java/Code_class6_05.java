public class Code_class6_05 {
    public  static void main(String[] args) {

        int hap = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 4 != 0) {
            hap += 1;
        }
        System.out.println("1~100의 합계(4의 배수 제외) : " + hap);
    }
}
