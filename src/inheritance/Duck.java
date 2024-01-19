package inheritance;

public class Duck implements Bird {
    @Override
    public void swim() {
        System.out.println("I can swim!");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
