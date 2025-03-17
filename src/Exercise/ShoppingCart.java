package Exercise;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What item would you like to buy? ");
        String item = sc.nextLine();
        System.out.print("What price is for each item? ");
        double price = sc.nextDouble();
        System.out.print("How many would you like? ");
        int quantity = sc.nextInt();

        System.out.println("You have bought " + quantity + " " + item +"/s");
        System.out.println("Your total: $" + price * quantity);
    }
}
