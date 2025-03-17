public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }

        i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);

        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        for (i = 1; i <= 3; i++) {  // Outer Loop
            for (int j = 1; j <= 3; j++) {  // Inner Loop
                System.out.print(i * j + " ");
            }
            System.out.println();  // New line after each row
        }

    }
}
