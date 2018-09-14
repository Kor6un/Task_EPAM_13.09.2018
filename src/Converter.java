import java.util.ArrayList;
import java.util.List;

public class Converter {
    private List<Speed> listOfSpeeds;
    private List<Speed> listOfConvertedSpeeds = new ArrayList<>();
    private Time time;

    Converter (List<Speed> listOfSpeeds, Time time) {
        this.listOfSpeeds = listOfSpeeds;
        this.time = time;
    }

    public Speed convertSpeedToMS(Speed speed){
        String speedCode = speed.getSpeedCode();
        double speedValue = speed.getSpeedValue();
        switch (speedCode){
            case "kmh":
                return new Speed(speedValue*1000/3600, "ms");
            case "mph":
                return new Speed(speedValue*1609/3600, "ms");
            case "kn":
                return new Speed(speedValue*1852/3600, "ms");
            case "ms":
                return new Speed(speedValue, speedCode);
            default:
                break;
        }
        return speed;
    }

    public List<Speed> convertAllSpeeds (List<Speed> listOfSpeeds) {
        for (int i = 0; i < listOfSpeeds.size(); i++) {
            listOfConvertedSpeeds.add(convertSpeedToMS(listOfSpeeds.get(i)));
        }
        return listOfConvertedSpeeds;
    }

    public List<Speed> getListOfConvertedSpeeds() {
        return listOfConvertedSpeeds;
    }
}
