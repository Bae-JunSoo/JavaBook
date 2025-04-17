package yyy;

import java.util.Scanner;

public class Code_class7_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rabbit05 rabbit1 = new Rabbit05("원");
        Rabbit05 rabbit2 = new Rabbit05("삼각형");
        Rabbit05 rabbit3 = new Rabbit05("토끼");


        System.out.printf("토끼1 객체의 모양은 [%s]입니다.\n", rabbit1.shape);
        System.out.printf("토끼2 객체의 모양은 [%s]입니다.\n", rabbit2.shape);
        System.out.printf("토끼3 객체의 모양은 [%s]입니다.\n", rabbit3.shape);
    }
}
