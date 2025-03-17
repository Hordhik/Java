public class Strings {
    public static void main(String[] args) {
        String name = "BroCode";
        //Getting properties of the string
         int length = name.length();          // Gets the length of the string
         char letter = name.charAt(0);        // Gets the first character ('B')
         int index = name.indexOf(" ");       // Finds the first occurrence of a space (returns -1 if not found)
         int lastIndex = name.lastIndexOf("o"); // Finds the last occurrence of 'o'

         //Modifying the string (Strings in Java are immutable, so these methods return new strings)
         name = name.toUpperCase();           // Converts to uppercase ("BROCODE")
         name = name.toLowerCase();           // Converts to lowercase ("brocode")
         name = name.trim();                   // Removes leading and trailing spaces
         name = name.replace("o", "a");        // Replaces 'o' with 'a' ("BraCade")

        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        } else {
            System.out.println("Your name DOESN'T contain any spaces");
        }

        if (name.equals("password")) {
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello " + name);
        }

    }
}
