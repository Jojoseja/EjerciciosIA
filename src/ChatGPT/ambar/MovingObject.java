package ChatGPT.ambar;

public abstract class MovingObject {
    //measured in Kg
    protected double mass;
    //measured in m/s
    protected double velocity;

    abstract void updatePosition(double time);

    public MovingObject(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "MovingObject{" +
                "mass=" + mass +
                ", velocity=" + velocity +
                '}';
    }
}
