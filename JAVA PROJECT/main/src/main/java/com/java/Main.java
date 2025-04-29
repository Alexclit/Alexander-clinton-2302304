package com.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.sleep();
        dog.bark();
        
        System.out.println("\n=== Single Inheritance with Method Overriding ===");
        Cat cat = new Cat("Whiskers");
        cat.eat();  // Overridden method
        cat.sleep();
        cat.meow();
        
        System.out.println("\n=== Multilevel Inheritance ===");
        BabyDog babyDog = new BabyDog("Tiny");
        babyDog.eat();    // From Animal
        babyDog.bark();    // Overridden method
        babyDog.weep();    // New method
        
        System.out.println("\n=== Hierarchical Inheritance ===");
        Bird bird = new Bird("Tweety");
        bird.eat();        // Overridden method
        bird.fly();       // New method
        
        System.out.println("\n=== Multiple Inheritance using Interface ===");
        Duck duck = new Duck("Donald");
        duck.eat();        // Inherited from Bird (which overrides Animal)
        duck.fly();        // From Bird
        duck.swim();       // From SwimAbility interface
        duck.quack();      // New method
    }
}