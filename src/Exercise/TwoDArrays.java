package Exercise;

public class TwoDArrays {
    public static void main(String[] args) {
        String[][] groceries = {{"apple", "orange", "banana"},
                {"potato", "onion", "carrot"},
                {"chicken", "pork", "beef", "fish"}};

        groceries[2][1] = "eggs";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
