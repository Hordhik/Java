//class
class ClassName {
    // Fields
    int field1;
    String field2;

    // Constructor
    public ClassName(int f1, String f2) {
        field1 = f1;
        field2 = f2;
    }

    // Methods
    void display() {
        System.out.println(field1 + " " + field2);
    }
}


public class oops {
    public static void main(String[] args) {
        ClassName obj = new ClassName(10, "Java"); // obj instance(object) of ClassName
        obj.display();  // Output: 10 Java
    }
}
