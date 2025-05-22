import java.util.Arrays;
import java.util.Collections;

public class Code09_8 {
    public static void main(String[] args) {

        int[] ary = {33, 99, 11, 77, 22, 88, 66, 44};
        Arrays.sort(ary);
        for (int data : ary) {
            System.out.print(data + " ");
        }
        System.out.println();

        String[] str = {"한빛", "아카데미", "난생", "자바", "열공"};
        Arrays.sort(str, Collections.reverseOrder());
        for (String data : str) {
            System.out.print(data + " ");
        }
    }
}
