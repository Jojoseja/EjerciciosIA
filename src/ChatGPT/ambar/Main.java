package ChatGPT.ambar;

public class Main {
    public static void main(String[] args) {
        Ball ball01 = new Ball(10,15,0, 0);
        ball01.applyForce(50,1);
        ball01.updatePosition(5);
        System.out.println(ball01);
    }
}
