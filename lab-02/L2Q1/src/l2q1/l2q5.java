package l2q1;

import java.util.Random;

public class l2q5 {
    public static void main(String[] args) {
        // generates one random number between 0-10000. display and summ all the digits
        Random generator = new Random();
        int number = generator.nextInt(10001); // generates a number from 0 to 10000
        int temp = number; // i'm gonna use this as the temporary variable to sum the digits
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10; // add the last digit to sum
            temp /= 10; // remove the last digit
        }
        System.out.println("Numbers: " + number);
        System.out.println("Sum of digits: " + sum);
    }
}
