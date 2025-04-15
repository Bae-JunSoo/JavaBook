public class Code07_1 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        int x,y;

        turtle.shape("arrow");
        turtle.shapeSize(50, 50);
        turtle.down();
        turtle.left(45);
        turtle.forward(200);

        x = (int) turtle.getX();
        y = (int) turtle.getY();
        System.out.println("거북이 위치 ==>"  + x + "," + y);
    }
}
