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

class MyClass {
    int x;
    String y;

    // Default constructor
    MyClass() {
        x = 5;
    }
    // Parameterized constructor
    MyClass(int val) {
        x = val;
    }
    //Constructor Overloading
    MyClass(int val, String str) {
        x = val;
        y = str;
    }
}

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super();  // Calls the constructor of Animal
        System.out.println("Dog constructor");
    }

    void sound() {
        System.out.println("Dog barks");
    }
}

public class oops {
    public static void main(String[] args) {
        ClassName obj = new ClassName(10, "Java"); // obj instance(object) of ClassName
        obj.display();  // Output: 10 Java

        System.out.println("\nConstructor: ");
        MyClass constructor1 = new MyClass();
        MyClass constructor2 = new MyClass(10);
        MyClass constructor3 = new MyClass(7, "Java");
        System.out.println(constructor1.x + "\n" + constructor2.x + "\n" + constructor3.x + " " + constructor3.y);

        System.out.println("\nInheritance: ");
        Dog d = new Dog();//super
        d.sound();//method override


    }
}
