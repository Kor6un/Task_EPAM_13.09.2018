public class Time {

    private double value;
    private int unitCode;

    Time (double value, int uniteCode) {
        this.value = value;
        this.unitCode = uniteCode;
    }

    public double convertTime(int unitCode) {
        switch (unitCode) {
            case 0:
                return value * 3600;
            case 1:
                return value * 60;
            case 2:
                return value;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Time = " + value);
    }
}

