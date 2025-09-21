// 1. This is the Class (the blueprint)
public class Dog {

    // 2. These are Attributes (what a Dog 'has')
    String name;
    String breed;
    int age;

    // 3. This is a Method (what a Dog 'can do')
    void bark() {
        System.out.println("Woof! Woof! My name is " + name);
    }
}

// This class contains the main method where our program starts
public class Main {
    public static void main(String[] args) {

        // 4. Create an Object from the Dog class
        Dog myPet = new Dog();

        // 5. Set the attributes for the 'myPet' object
        myPet.name = "Rex";
        myPet.breed = "German Shepherd";
        myPet.age = 3;

        // 6. Create a SECOND Object from the same Dog class
        Dog neighboursPet = new Dog();
        neighboursPet.name = "Fido";
        neighboursPet.breed = "Beagle";
        neighboursPet.age = 5;

        // 7. Make the objects perform an action (call their methods)
        myPet.bark();       // Rex will bark
        neighboursPet.bark(); // Fido will bark
    }
}
-----------
Output
-----------
Woof! Woof! My name is Rex
Woof! Woof! My name is Fido