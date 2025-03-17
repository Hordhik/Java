import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter a age: ");
        int age = scanner.nextInt();
        System.out.print("Please enter a gpa: ");
        double gpa = scanner.nextDouble();
        System.out.print("Are you a Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your gpa is " + gpa);
        if (isStudent) {
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}
