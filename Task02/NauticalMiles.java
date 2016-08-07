/**
 * Created by Heylon2 on 7/08/2016.
 */
public class NauticalMiles {
    public static void main(String[] args) {
        final double KILOMETERSCONVERSION = 1.852;
        final double MILESCONVERSION = 1.50779;
        double nauticalMiles = 1.5;

        System.out.printf(nauticalMiles + " Nautical miles is " + (nauticalMiles * KILOMETERSCONVERSION) + " Kilometers%n");
        System.out.printf(nauticalMiles + " Nautical miles is " + (nauticalMiles * MILESCONVERSION) + " Miles");
    }
}
