package l2q1;

import java.util.Locale;
import java.util.Scanner;

public class l2q6 {
    public static void main(String[] args) {
        // calculates the energy needed to heat water. 
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("The amount of water in grams : ");
        double grams = keyboard.nextDouble();
        System.out.print("Initial temperature (Fahrenheit) : ");
        double initialTemp = keyboard.nextDouble();
        System.out.print("Final temperature (Fahrenheit) : ");
        double finalTemp = keyboard.nextDouble();

        double massKg = grams / 1000.0;
        double initialC = (initialTemp - 32) / 1.8;
        double finalC = (finalTemp - 32) / 1.8;

        double energy = massKg * (finalC - initialC) * 4184; //in joules
        System.out.printf(Locale.US, "The energy needed : %.2f J%n", energy);
    }
}
