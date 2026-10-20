package l2q1;

import java.util.Locale;
import java.util.Scanner;

public class l2q2 {
    public static void main(String[] args) {
        // calculate monthly payment for car loan. output in two decimal places
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Car Price : ");
        double p = keyboard.nextDouble();
        System.out.print("Down Payment : ");
        double d = keyboard.nextDouble();
        System.out.print("Interest Rate (%) : ");
        double r = keyboard.nextDouble();
        System.out.print("Loan Duration (years) : ");
        double y = keyboard.nextDouble();
        double m = (p - d) * (1 + r * y / 100) / (y *12);
        System.out.printf(Locale.US, "Monthly Payment : RM %.2f%n", m);
    }
}
