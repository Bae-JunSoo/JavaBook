class Rabbit_case {
    String shape;
    int x;
    int y;

    void move(int xpos, int ypos) {
        this.x = xpos;
        this.y = ypos;

        System.out.println("Xpos : " + x + " Ypos : " + y);
    }
}

class HouseRabbit extends Rabbit_case {
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }

    @Override  //어노테이션
    void move(int xpos, int ypos) {
        System.out.println("난 재정의된 함수다.");
    }
}

class MountainRabbit extends Rabbit_case {
    String mountain;
    void eatWildglass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code_class8_1 {
    public static void main(String[] args) {
        HouseRabbit house = new HouseRabbit();
        MountainRabbit mountain = new MountainRabbit();

        house.shape = "삼각형";
        house.owner = "난생이";
        house.eatFeed();
        house.move(100, 100);

        mountain.shape = "네모";
        mountain.mountain = "설악산";
        mountain.eatWildglass();
        mountain.move(200, 200);

    }
}
