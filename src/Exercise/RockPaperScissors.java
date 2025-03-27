package Exercise;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        boolean playAgain = true;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (playAgain) {

            System.out.println("\nChoose: (1) Rock, (2) Paper, (3) Scissors");
            System.out.print("Enter your choice: ");
            int userChoice = scanner.nextInt() - 1;


            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                continue;
            }

            int computerChoice = random.nextInt(3);

            System.out.println("You chose: " + choices[userChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                    (userChoice == 1 && computerChoice == 0) ||
                    (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\nThanks for playing! Goodbye.");
        scanner.close();
    }
}

