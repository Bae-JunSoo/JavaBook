import java.util.Scanner;

public class Code09_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[4];
        int hap = 0;

        for(int i = 0; i < nums.length; i++){
            System.out.print("숫자 : ");
            nums[i] = s.nextInt();
            hap += nums[i];
        }

        System.out.println("합계 : " + hap);
    }
}
