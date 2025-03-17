package aluminium;

public class Ball {
    //measured in meters
    float originalPosition;
    //measured in m/s
    float speed;
    //measured in m/(s*s)
    float acceleration;

    public Ball(float originalPosition, float speed, float acceleration) {
        this.originalPosition = originalPosition;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public float getOriginalPosition() {
        return originalPosition;
    }

    public void setOriginalPosition(float originalPosition) {
        this.originalPosition = originalPosition;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }
    public void chocar(Ball ball2){
        float ux = this.getOriginalPosition();
        float sx = this.getSpeed();
        float ax = this.getAcceleration();
        float uy = ball2.getOriginalPosition();
        float sy = ball2.getSpeed();
        float ay = ball2.getAcceleration();
        double tiempo = (ux-uy)/(sy-sx+0.5*(ay-ax));
        System.out.println("Tardará en chocarse: " + tiempo + " segundos");
    }
}
