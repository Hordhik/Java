package Exercise;

import java.util.Scanner;

public class BankerProblem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        double balance = 0;
        boolean isRun = true;
        int choice;

        System.out.println("***************");
        System.out.println("BANKING PROBLEM");
        System.out.println("***************");
        System.out.println("1. Show Balance: ");
        System.out.println("2. Deposit: ");
        System.out.println("3. Withdraw: ");
        System.out.println("4. Exit: ");
        System.out.print("***************");
        System.out.println("Enter your choice (1-4): ");
        choice = sc.nextInt();

        while (isRun) {
            switch (choice) {
                case 1:
                    showBalance(balance);

                case 2:
                    balance += deposit();
                case 3:
                    balance -= withdraw(balance);
                case 4:
                    isRun = false;
                default:
                    System.out.println("Invalid choice");
            }
        }
        System.out.println("Thank you! Hve a nice day!");
    }

    static void showBalance(double balance) {
        System.out.print("***************");
        System.out.println("Balance: $" + balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter amount to be deposited: ");
        amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid amount");
            return 0;
        }
        else {
            return amount;
        }

    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

}
