public class Practice3 {
    public static void main(String[] args) {

        int resilt = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                resilt += i;
            }
        }

        System.out.println(resilt);
    }
}
