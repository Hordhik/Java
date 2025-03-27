package Exercise;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        // Declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int balance = 100;
        boolean playAgain = true;
        String[] symbols = {"Cherry", "Lemon", "Bell", "Bar", "Seven"};

        System.out.println("Welcome to the Java Slot Machine!");

        while (playAgain && balance > 0) {
            System.out.println("\nYour current balance: $" + balance);
            System.out.print("Enter your bet amount: ");
            int bet = scanner.nextInt();

            if (bet > balance || bet <= 0) {
                System.out.println("Invalid bet! Enter a valid amount.");
                continue;
            }

            balance -= bet;

            String[] spinResult = {symbols[random.nextInt(symbols.length)],
                    symbols[random.nextInt(symbols.length)],
                    symbols[random.nextInt(symbols.length)]};

            System.out.println("Spinning...\n");
            System.out.println("| " + spinResult[0] + " | " + spinResult[1] + " | " + spinResult[2] + " |");

            int payout = 0;
            if (spinResult[0].equals(spinResult[1]) && spinResult[1].equals(spinResult[2])) {
                payout = bet * 5; // Jackpot
                System.out.println("JACKPOT! You win $" + payout);
            } else if (spinResult[0].equals(spinResult[1]) || spinResult[1].equals(spinResult[2])) {
                payout = bet * 2; // Small win
                System.out.println("Nice! You win $" + payout);
            } else {
                System.out.println("Better luck next time!");
            }

            balance += payout;

            if (balance > 0) {
                System.out.print("Do you want to play again? (yes/no): ");
                playAgain = scanner.next().equalsIgnoreCase("yes");
            } else {
                System.out.println("You're out of money!");
                playAgain = false;
            }
        }

        System.out.println("\nThanks for playing! Your final balance: $" + balance);
        scanner.close();
    }
}

