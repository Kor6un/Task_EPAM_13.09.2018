public class Speed {

    private String speedCode;
    private double speedValue;

    Speed(double speedValue, String speedCode) {
        this.speedCode = speedCode;
        this.speedValue = speedValue;
    }

    public double getSpeedValue() {
        return speedValue;
    }

    public String getSpeedCode() {
        return speedCode;
    }

    @Override
    public String toString () {
        return String.format("Speed = " + speedValue + " " + speedCode);
    }
}

