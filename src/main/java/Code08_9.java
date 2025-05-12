interface  Rabbit08_9 {
    abstract void sleep();

}

class HouseRabbit08_9 implements Rabbit08_9 {
    public void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit08_9 implements Rabbit08_9 {
    public void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code08_9 {
    public static void main(String[] args) {
        HouseRabbit08_9 hiRabbit = new HouseRabbit08_9();
        MountainRabbit08_9 mRabbit = new MountainRabbit08_9();

        hiRabbit.sleep();
        mRabbit.sleep();
    }
}
