package polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        House house = new House(4,2);
        System.out.println("There are "+house.getDoor()+" doors");
        house.setDoor(1);
        System.out.println("There are "+house.getDoor()+" doors");
    }
}
