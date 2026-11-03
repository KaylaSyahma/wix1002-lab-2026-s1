package l4q1;

import java.util.Scanner;

public class l4q2 {
    public static void main(String[] args) {
        // accept int input then sum 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n = keyboard.nextInt();

        long term = 0;    // 1 + 2 + ... + i
        long total = 0;   // sum of all the terms
        for (int i = 1; i <= n; i++) {
            term += i;
            total += term;
        }
        System.out.println("Sum = " + total);
    }
}
