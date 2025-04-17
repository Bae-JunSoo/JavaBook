import java.util.Scanner;

class Rabbit_LAB {

    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}
public class Code07_LAB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Rabbit_LAB rabbit;
        int x, y;

        rabbit = new Rabbit_LAB();

        rabbit.shape = "토끼";
        while (true) {
            System.out.print("토끼가 이동할 X좌표 : ");
            x = s.nextInt();
            System.out.print("토끼가 이동할 Y좌표 : ");
            y = s.nextInt();
            rabbit.setPosition(x, y);
            System.out.printf("** 토끼의 현재 위치는 (%d, %d)입니다\n", x, y);
        }
    }
}