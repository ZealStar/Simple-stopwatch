import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Stopwatch {

    private long startTime = 0;
    private long stopTime =0 ;
    private boolean isRunning = false;

    public Stopwatch() {
        System.out.println("WELCOME IN STOPWATCH PROGRAM");
        reset(); // Constructor: Initializes the stopwatch by resetting it
    }

    // start time
    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis(); // Record the current time when starting the stopwatch
            isRunning = true; // Set the stopwatch to a running state
        } else {
            System.out.println("Stopwatch is already running."); // Inform the user that the stopwatch is already running
            displayElapsedTime(); // Display the elapsed time to provide feedback to the user
            System.out.println("\n"); // Add a newline for clarity
        }
    }



    public void reset() {
        System.out.println("The Time for Stopwatch is:"); // Display a message to inform the user
        displayElapsedTime(); // Display the elapsed time
        startTime = 0; // Reset the start time to zero
        stopTime = 0; // Reset the stop time to zero
        System.out.println("Stopwatch is reset and ready for use."); // Inform the user that the stopwatch is reset and ready
    }

    public void stop() {
        if (isRunning()) {
            stopTime = System.currentTimeMillis(); // Record the stop time
            System.out.println("Stopwatch stopped."); // Inform the user that the stopwatch has stopped
            displayElapsedTime(); // Display the elapsed time
        } else {
            System.out.println("Stopwatch is not running.\n"); // Inform the user that the stopwatch is not running
        }
    }

    // Checks if the stopwatch is running
    private boolean isRunning() {
        return startTime > 0 && stopTime == 0;
    }

    // Calculate and return the elapsed time in milliseconds
    private long getElapsedTime() {
        if (isRunning()) {
            return System.currentTimeMillis() - startTime; // Calculate elapsed time if the stopwatch is running
        } else {
            return stopTime - startTime; // Calculate elapsed time if the stopwatch is stopped
        }
    }

    // Display the elapsed time in "HH:mm:ss" format
    private void displayElapsedTime() {
        long elapsedTime = getElapsedTime(); // Get the elapsed time in milliseconds
        long hours = elapsedTime / 3600000; // Calculate hours
        long minutes = (elapsedTime % 3600000) / 60000; // Calculate minutes
        long seconds = (elapsedTime % 60000) / 1000; // Calculate seconds
        System.out.printf("Elapsed Time: %02d:%02d:%02d\n", hours, minutes, seconds); // Display the formatted elapsed time
    }



}
