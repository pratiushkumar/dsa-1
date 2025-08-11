package topnew;
import java.util.*;

class Animal {
    void speak() { System.out.println("Animal speaking"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Dog barking"); }
}

class Cat extends Animal {
    void meow() { System.out.println("Cat meowing"); }
}

public class UpperBound{
    static void makeAnimal(List<? extends Animal> store )  {
        for(Animal a : store)  {
            a.speak();
        }
    }

    public static void main(String[] args) {
       List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
       makeAnimal(dogs);
        // works with Dog because Dog extends Animal
    }
}
