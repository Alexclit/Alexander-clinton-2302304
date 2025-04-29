// Multiple inheritance: Duck inherits from Bird and implements SwimAbility
public class Duck extends Bird implements SwimAbility {
    public Duck(String name) {
        super(name);
    }
    
    @Override
    public void swim() {
        System.out.println(getName() + " is swimming in the pond.");
    }
    
    public void quack() {
        System.out.println(getName() + " says: Quack quack!");
    }
}