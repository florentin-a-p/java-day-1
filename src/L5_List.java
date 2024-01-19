import java.util.ArrayList;
import java.util.List;

public class L5_List {
    public static void main(String[] args) {
        // Create a list with three elements
        List<String> myList = new ArrayList<>();
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");

        // Using a standard for loop
        System.out.println("Using a standard for loop:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Using an enhanced for loop
        System.out.println("\nUsing an enhanced for loop:");
        for (String element : myList) {
            System.out.println(element);
        }
    }
}
