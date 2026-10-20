package l2q1;

import java.util.Locale;
import java.util.Scanner;

public class l2q1 {
    public static void main(String[] args) {
        // convert the temperature in fahrenheit to celcius
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = keyboard.nextDouble();
        double celcius = (fahrenheit - 32) / 1.8; 
        System.out.printf("Celcius: %.2f%n", celcius);
    }
}