// Single inheritance: Cat inherits from Animal
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    public void meow() {
        System.out.println(getName() + " says: Meow!");
    }
    
    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish.");
    }
}