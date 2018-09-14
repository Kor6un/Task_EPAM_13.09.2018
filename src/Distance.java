public class Distance {

    double time, speed;

    Distance (double time, double speed) {
        this.time = time;
        this.speed = speed;
    }

    public double getDistance () {
        return time * speed;
    }

    @Override
    public String toString() {
        return String.format("Distance = " + getDistance() + " m");
    }
}
