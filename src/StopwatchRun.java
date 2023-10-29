import java.util.InputMismatchException;
import java.util.Scanner;

public class StopwatchRun {


    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch(); // Create a Stopwatch object
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        int choice; // Initialize the choice variable to store user input

        while (true) {
            System.out.println("Menu:");
            System.out.println("1- Start");
            System.out.println("2- Stop");
            System.out.println("3- Reset");
            System.out.println("Note: Enter any non-integer value to exit");

            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt(); // Try to read an integer choice from the user
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. You did not enter an integer.\n\n"); // Handle non-integer input
                scanner.next(); // Consume the invalid input
                continue; // Continue the loop without exiting
            }

            switch (choice) {
                case 1:
                    stopwatch.start(); // Start the stopwatch
                    break;
                case 2:
                    stopwatch.stop(); // Stop the stopwatch
                    break;
                case 3:
                    stopwatch.reset(); // Reset the stopwatch
                    break;
                default:
                    System.out.println("Thanks!"); // Display a message
                    System.exit(0); // Exit the program
            }
        }
    }

}
