import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        /*Rapidity rap = Rapidity.MS;
        int speedCode = rap.ordinal();
        Speed speed = new Speed(1, speedCode);
        System.out.println(speed + " " + rap.getSpeedUnit(speedCode));


        TimeUnit timeUnit = TimeUnit.MINUTES;
        int timeCode = timeUnit.ordinal();
        Time time = new Time(4, timeCode);
        System.out.println(time + " " + timeUnit.getTimeUnit(timeCode));

        Distance distance = new Distance(time.convertTime(timeCode), speed.convertSpeed(speedCode));
        System.out.println(distance);
*/
        System.out.println("Input file name");
        String fileName;
        Scanner scanner = new Scanner(System.in);
        fileName = scanner.nextLine();

        DataReader dr = new DataReader(fileName);
        Converter converter = new Converter(dr.getListOfSpeeds(), dr.getTime());
        converter.convertAllSpeeds(dr.getListOfSpeeds());
        System.out.println(converter.getListOfConvertedSpeeds());
    }
}
