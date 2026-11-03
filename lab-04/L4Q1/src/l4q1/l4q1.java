package l4q1;

import java.util.Scanner;

public class l4q1 {
    public static void main(String[] args) {
        // accept integer input then display its entire factors in increasing order
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = keyboard.nextInt();

        System.out.print("The factors are: 1");
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(", " + i);
            }
        }
        System.out.println();
    }
}
