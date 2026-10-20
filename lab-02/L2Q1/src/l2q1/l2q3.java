package l2q1;

import java.util.Locale;
import java.util.Random;

public class l2q3 {
    public static void main(String[] args) {
        Random generator = new Random();
        int first = generator.nextInt(41) + 10; // nextInt(41) generates a number from 0 to 40, +10 shifts it to 10 to 50
        int second = generator.nextInt(41) + 10; 
        int third = generator.nextInt(41) + 10; 
        int sum = first + second + third;
        double average = sum / 3.0; // Use 3.0 to ensure floating-point division
        System.out.printf("Numbers: %d, %d, %d%n", first, second, third);
        System.out.println("Sum = " + sum);
        System.out.printf(Locale.US, "The average of the three random numbers is: %.2f%n", average);
    }
}



