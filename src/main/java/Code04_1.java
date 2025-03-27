public class Code04_1 {
    public static void main(String[] args) {

        byte a = 127;
        short b = 32767;
        int c = 2147483647;

        System.out.println((byte)(a + 1));
        System.out.println((short)(b + 1));
        System.out.println((int)(c + 1));

        // 각 변수 단위의 최댓값을 1이라도 넘겼을시 최솟값으로 치환됨
    }
}
