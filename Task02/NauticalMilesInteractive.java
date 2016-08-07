/**
 * Created by Heylon2 on 7/08/2016.
 */
import java.util.Scanner;
public class NauticalMilesInteractive {
    public static void main(String[] args) {
        final double KILOMETERSCONVERSION = 1.852;
        final double MILESCONVERSION = 1.50779;
        Scanner inputDevice = new Scanner(System.in);
        System.out.printf("Enter Nautical miles to convert ");

        double nauticalMiles = inputDevice.nextDouble();

        System.out.printf(nauticalMiles + " Nautical miles is " + (nauticalMiles * KILOMETERSCONVERSION) + " Kilometers%n");
        System.out.printf(nauticalMiles + " Nautical miles is " + (nauticalMiles * MILESCONVERSION) + " Miles");
    }
}
