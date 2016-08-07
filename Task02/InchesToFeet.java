//Interactive
import java.util.Scanner;
class InchesToFeet {
    public static void main(String[] args){
        int inches;
        Scanner inputDevice = new Scanner(System.in);
        System.out.printf("Enter inches: ");
        inches = inputDevice.nextInt();
        int feet = inches / 12;
        inches = inches % 12;
        System.out.printf(feet + "'" + inches + '"');

    }

}