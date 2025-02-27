package ChatGPT.ambar;

public class Ball extends MovingObject implements ForceApplicable{
    double positionX;
    double acceleration;

    public Ball(double mass, double velocity, double positionX, double acceleration) {
        super(mass, velocity);
        this.positionX = positionX;
        this.acceleration = acceleration;
    }


    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public void applyForce(double force, double time) {
        setVelocity(this.velocity + this.acceleration*time);
        System.out.println("Velocity is now: " + this.velocity);
    }

    @Override
    void updatePosition(double time) {
        setPositionX(this.positionX + this.velocity*time + (this.acceleration*time*time)/2);
        System.out.println("New X Position is: " + this.positionX);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "positionX=" + positionX +
                ", acceleration=" + acceleration +
                ", mass=" + mass +
                ", velocity=" + velocity +
                '}';
    }
}
