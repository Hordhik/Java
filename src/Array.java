import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana", "Pear"};
        fruits[0] = "Pineapple";
//        int numOfFruits = fruits.length;

//        Sorting
//        Arrays.sort(array) – Sorts the array in ascending order.
//        Arrays.sort(array, Comparator) – Sorts using a custom comparator.
//        Arrays.parallelSort(array) – Parallel sorting for better performance.

//        Searching
//        Arrays.binarySearch(array, key) – Searches for an element (requires sorted array).
//        Arrays.binarySearch(array, fromIndex, toIndex, key) – Searches within a range.

//        Filling
//        Arrays.fill(array, value) – Fills the entire array with a value.
//        Arrays.fill(array, fromIndex, toIndex, value) – Fills a specific range.

//        Copying & Cloning
//        Arrays.copyOf(array, newLength) – Copies array to a new length.
//        Arrays.copyOfRange(array, from, to) – Copies a specific range.
//        array.clone() – Clones the array (shallow copy).

//        Equality & Comparison
//        Arrays.equals(arr1, arr2) – Checks if two arrays are equal.
//        Arrays.deepEquals(arr1, arr2) – Checks equality for nested arrays.

//        Converting to String
//        Arrays.toString(array) – Converts an array to a string.
//        Arrays.deepToString(array) – Converts nested arrays to a string.

//        Converting to List
//        Arrays.asList(array) – Converts an array to a fixed-size List.

        for( String fruit : fruits ) {
            System.out.println(fruit);
        }
    }
}
