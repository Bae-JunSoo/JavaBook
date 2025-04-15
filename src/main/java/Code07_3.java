public class Code07_3 {
    public static void main(String[] args){

        Turtle t1 = new Turtle();
        Turtle t2 = new Turtle();
        Turtle t3 = new Turtle();

        t1.shape("circle");
        t1.setPosition(100,100);
        t2.shape("turtle");
        t2.setPosition(0,-100);
        t3.shape("triangle");
        t3.setPosition(-100,100);
    }
}
