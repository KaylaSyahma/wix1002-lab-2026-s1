package l4q1;

import java.util.Random;

public class l4q5 {
    public static void main(String[] args) {
        // two players dice game. the 1st to get the 100th point wins. get 6 and u can roll again
         Random random = new Random();
        int[] score = new int[2];
        int player = 0;     // 0 is Player 1, 1 is Player 2

        while (true) {
            int roll;
            do {
                roll = random.nextInt(6) + 1;   // 1 to 6
                score[player] += roll;
                System.out.println("Player " + (player + 1) + " rolls " + roll
                        + " -> total " + score[player]
                        + (roll == 6 && score[player] <= 100 ? " (rolls again)" : ""));
            } while (roll == 6 && score[player] <= 100);

            if (score[player] > 100) {
                System.out.println("Player " + (player + 1) + " wins!");
                break;
            }
            player = 1 - player;   // switch turns
        }

    }
}
