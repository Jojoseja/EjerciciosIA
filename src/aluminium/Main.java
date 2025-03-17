package aluminium;

public class Main {
    public static void main(String[] args) {
        Ball ball01 = new Ball(0,-33.3f,8);
        Ball ball02 = new Ball(100,  33.3f,-8);
        ball01.chocar(ball02);
    }
}
