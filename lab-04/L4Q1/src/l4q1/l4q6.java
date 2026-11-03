package l4q1;

import java.util.Random;

public class l4q6 {
    public static void main(String[] args) {
        // generates a random non-negative integer and display the number of its digits
        Random random = new Random();
        int number = random.nextInt(Integer.MAX_VALUE); // 0 to 2147483646

        int digits = 0;
        int remaining = number;
        do { // do-while: 0 still has one digit
            digits++;
            remaining /= 10;
        } while (remaining != 0);

        System.out.println("Number: " + number);
        System.out.println("Number of digits: " + digits);

    }
}
