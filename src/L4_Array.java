public class L4_Array {
    public static void main(String[] args) {
        // Define an array with three elements
        int[] myArray = {1, 2, 3};

        // Using a standard for loop
        System.out.println("Using a standard for loop:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // Using an enhanced for loop
        System.out.println("\nUsing an enhanced for loop:");
        for (int element : myArray) {
            System.out.println(element);
        }
    }
}
