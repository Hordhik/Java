

// Rules
//public void example(int... values, String... words) { }
//public void example(String name, int... values) { }
//public void example(int... values, String name) { }

public class VarArgs {
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);  // Output: 1 2 3 4 5
        printNumbers(10, 20);         // Output: 10 20
        printNumbers();               // Output: (Nothing, empty array)
    }
    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
