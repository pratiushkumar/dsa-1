package topnew;

import java.util.ArrayList;
import java.util.List;

class Anima1l {
    void speak() { System.out.println("Animal speaking"); }
}

class Dog1 extends Animal1 {
    void bark() { System.out.println("Dog barking"); }
}

class Cat1 extends Animal1 {
    void meow() { System.out.println("Cat meowing"); }
}
public class LowerBound {
    static void addDogs(List<? super Dog> animals) {
        animals.add(new Dog()); // ✅ Allowed
        // Dog d = animals.get(0); ❌ Only returns Object
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        addDogs(animals); // works with Animal (superclass of Dog)
    }
}
