import java.util.Scanner;

public class Stopwatch {

    private static long startTime = 0;
    private static boolean isRunning = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Display command line menu

        System.out.println("1. Start");

        System.out.println("select from above options: ");

        // get users choice

        int choice = scanner.nextInt() ;

        switch (choice) {
            case 1:
                start();
                break;

            default:
                System.out.println("Invalid choice");
        }


    }

    // start time
    public static void start() {
        if(!isRunning){
            startTime = System.currentTimeMillis();
            isRunning = true;
        }
    }

}