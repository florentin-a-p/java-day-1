import java.util.Scanner;

public class L2_InputOutput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        // Read the input as an integer
        int number = scanner.nextInt();

        // Check if the number is greater than 3
        if (number > 3) {
            System.out.println("Number is more than 3!");
        }

        // Close the scanner
        scanner.close();
    }
}
