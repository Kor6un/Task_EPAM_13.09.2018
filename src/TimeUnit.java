public enum TimeUnit {

    HOUR,
    MINUTES,
    SECONDS;

    public String getTimeUnit(int timeCode) {

        switch (timeCode) {
            case 0:
                return "h";
            case 1:
                return "m";
            case 2:
                return "s";

            default:
                return "Incorrect timeCode";
        }
    }
}
