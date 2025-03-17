package Exercise;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Interest rate(in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter the # time compound per year: ");
        int year = sc.nextInt();
        System.out.print("Enter the # of years: ");
        int years = sc.nextInt();

        double amount = principal * Math.pow(1 + rate / years, years * year );
        System.out.printf("The amount after %d years is %.2f ", years, amount);
    }
}
