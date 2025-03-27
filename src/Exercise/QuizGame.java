package Exercise;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Quiz Game!");

        String[] questions = {
                "What is the capital of France?",
                "Which programming language is this quiz written in?",
                "What is 2 + 2?"
        };

        String[][] options = {
                {"A. Paris", "B. London", "C. Rome", "D. Madrid"},
                {"A. Python", "B. C++", "C. Java", "D. JavaScript"},
                {"A. 3", "B. 4", "C. 5", "D. 6"}
        };

        char[] answers = {'A', 'C', 'B'};

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + (i + 1) + ". " + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            char guess = Character.toUpperCase(scanner.next().charAt(0));

            if (guess == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + answers[i]);
            }
        }

        System.out.println("\nQuiz Over!");
        System.out.println("Your final score: " + score + "/" + questions.length);

        scanner.close();
    }
}
