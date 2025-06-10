class Rabbit2 {

    String shape = "";

    Rabbit2() {
        System.out.println("난 자바가 기본으로 만들어주는 생성자");
    }
    Rabbit2(String value) {
        this.shape = value;
    }
}
public class Code_class7_Quiz {
    public static void main(String[] args) {
        Rabbit2 rabbit1 = new Rabbit2();

        Rabbit2 rabbit2 = new Rabbit2("원");
        Rabbit2 rabbit3 = new Rabbit2("삼각형");
        Rabbit2 rabbit4 = new Rabbit2("토끼");

        System.out.printf("토끼1 객체의 모양은 [%s]입니다.\n", rabbit2.shape);
        System.out.printf("토끼2 객체의 모양은 [%s]입니다.\n", rabbit3.shape);
        System.out.printf("토끼3 객체의 모양은 [%s]입니다.\n", rabbit4.shape);


    }
}
