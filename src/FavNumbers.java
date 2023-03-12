import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter favorite integer
        System.out.print("Enter your favorite integer: ");
        int favoriteInt = getInt(scanner);

        // Prompt user to enter favorite double
        System.out.print("Enter your favorite double: ");
        double favoriteDouble = getDouble(scanner);

        // Output user's favorite integer and double
        System.out.println("Your favorite integer is " + favoriteInt);
        System.out.println("Your favorite double is " + favoriteDouble);
    }

    // Method to get integer input from user
    public static int getInt(Scanner scanner) {
        int input;
        while (true) {
            try {
                input = scanner.nextInt(); // Attempt to read an int from user input
                break; // Exit loop if input is valid
            } catch (Exception e) { // Catch any exception thrown by nextInt() method
                scanner.nextLine(); // Discard invalid input
                System.out.print("Invalid input. Please enter an integer: "); // Prompt user again for valid input
            }
        }
        return input; // Return valid input
    }

    // Method to get double input from user
    public static double getDouble(Scanner scanner) {
        double input;
        while (true) {
            try {
                input = scanner.nextDouble(); // Attempt to read a double from user input
                break; // Exit loop if input is valid
            } catch (Exception e) { // Catch any exception thrown by nextDouble() method
                scanner.nextLine(); // Discard invalid input
                System.out.print("Invalid input. Please enter a double: "); // Prompt user again for valid input
            }
        }
        return input; // Return valid input
    }
}
