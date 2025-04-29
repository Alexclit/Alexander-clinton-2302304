// Multilevel inheritance: Animal -> Dog -> BabyDog
public class BabyDog extends Dog {
    public BabyDog(String name) {
        super(name);
    }
    
    public void weep() {
        System.out.println(getName() + " is weeping.");
    }
    
    // Overriding the bark method
    @Override
    public void bark() {
        System.out.println(getName() + " says: Tiny woof!");
    }
}