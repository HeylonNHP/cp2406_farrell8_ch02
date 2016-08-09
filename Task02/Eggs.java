/**
 * Created by Heylon2 on 9/08/2016.
 */
import java.util.Scanner;
public class Eggs {
    public static void main(String[] args){
        final double INDIVIDIALPRICE = 0.45;
        final double DOZENPRICE = 3.25;

        Scanner inputDevice = new Scanner(System.in);
        System.out.printf("Amount of eggs to buy ");
        int eggsAmount = inputDevice.nextInt();
        int leftOver = eggsAmount % 12;
        double totalPrice = (eggsAmount / 12) * DOZENPRICE + leftOver * INDIVIDIALPRICE;

        System.out.printf("You ordered " + eggsAmount + " eggs. That's ");

        if(eggsAmount/12 >= 1){
            System.out.printf((eggsAmount/12) + " dozen at $" + DOZENPRICE + " per dozen");
            if (leftOver >= 1){
                System.out.printf(" and ");
            }
        }
        if(leftOver >= 1){
            System.out.printf(leftOver + " loose eggs at $" + INDIVIDIALPRICE + " each");
        }

        System.out.printf(" for a total of $" + totalPrice + ".");
    }
}
