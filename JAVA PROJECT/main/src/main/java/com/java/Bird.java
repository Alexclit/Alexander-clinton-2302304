// Hierarchical inheritance: Animal is parent of both Dog and Bird
public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    
    public void fly() {
        System.out.println(getName() + " is flying.");
    }
    
    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println(getName() + " is eating seeds.");
    }
}