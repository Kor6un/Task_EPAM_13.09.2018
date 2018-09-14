import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class DataReader {
    private List<Speed> ListOfSpeeds = new ArrayList<Speed>();
    private Time time;
    private double timeValue, speedValue;
    private String timeCode, speedCode;
    private String temp;
    public DataReader(String fileName) throws FileNotFoundException {
        try {
            FileInputStream fstream = new FileInputStream("src/" + fileName + ".txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            Boolean flag = true;
            while ((strLine = br.readLine()) != null) {
                if (flag == true) {
                    String[] time = strLine.split("\\s");
                    timeValue = Double.parseDouble(time[0]);
                    timeCode = time[1];
                    flag = false;
                }
                else {
                    String[] speed = strLine.split("\\s");
                    speedValue = Double.parseDouble(speed[0]);
                    speedCode = speed[1];
                    ListOfSpeeds.add(new Speed(Double.parseDouble(speed[0]), speed[1]));
                }

            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public List<Speed> getListOfSpeeds() {
        return ListOfSpeeds;
    }

    public Time getTime() {
        return time;
    }
}
