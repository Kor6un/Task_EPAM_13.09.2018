public enum Rapidity {

    KMH,
    MPH,
    KN,
    MS;

    public String getSpeedUnit(int speedCode) {

        switch (speedCode) {
            case 0:
                return "kmh";
            case 1:
                return "mph";
            case 2:
                return "kn";
            case 3:
                return "ms";
            default:
                return "Incorrect speedCode";
        }
    }
}
