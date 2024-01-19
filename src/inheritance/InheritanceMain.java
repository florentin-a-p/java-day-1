package inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.fly();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.swim();
        mallardDuck.fly();
    }
}
