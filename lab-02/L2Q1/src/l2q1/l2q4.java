package l2q1;

import java.util.Scanner;

public class l2q4 {
    public static void main(String[] args) {
        // convert second to hours, minutes, and seconds 
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Number of seconds : ");
        long totalSeconds = keyboard.nextLong();
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;
        System.out.printf("%d seconds is %d hours, %d minutes, and %d seconds%n.", totalSeconds, hours, minutes, seconds);
    }
}
