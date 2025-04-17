class Rabbit3 {
    private String shape;  //토끼의 모양
    private int X;         //X위치
    private int Y;         //Y위치
    public int number;    // 이거 추가

    void serPosition(int x, int y) {
        this.X = x;
        this.Y = y;
    }
}

public class Code_class7_12 {
    public static void main(String[] args) {
        Rabbit3 rabbit = new Rabbit3();

        rabbit.serPosition(100, 200);

        rabbit.number = 1; //이거 추가 ( public 변수이기에 모든 자바 파일이 가져다 쓸 수 있음 )
        rabbit.X = 0;     //이거 추가  ( private 변수이기에 해당 class 파일안에서만 쓸 수 있음)
    }
}
