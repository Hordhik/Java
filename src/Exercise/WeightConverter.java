package Exercise;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert from lbs to kgs");
        System.out.println("2. Convert from kgs to lbs");
        System.out.println("Choose an option:");

        choice = scanner.nextInt();

        if(choice==1){
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("The new weight in kgs is " + newWeight);
        }
        else if(choice==2){
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 2.20462;
            System.out.println("The new weight in lbs is " + newWeight);
        }
        else {
            System.out.println("You have entered wrong choice");
        }

        scanner.close();
    }
}
