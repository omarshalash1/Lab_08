import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCost = 0.0;

        // Prompt user to enter price of item
        do {
            double itemPrice = getRangedDouble(scanner, "Enter the price of your item (0.50-9.99): ", 0.50, 9.99);
            totalCost += itemPrice;

            // Ask user if they have more items to input
            boolean hasMoreItems = getYNConfirm(scanner, "Do you have more items to input? (Y/N): ");
            if (!hasMoreItems) {
                break;
            }
        } while (true);

        // Output total cost of items
        System.out.printf("Total cost: $%.2f", totalCost);
    }

    // Method to get a double within a given range from the user
    public static double getRangedDouble(Scanner scanner, String prompt, double min, double max) {
        double input;
        while (true) {
            System.out.print(prompt);
            try {
                input = scanner.nextDouble();
                if (input >= min && input <= max) {
                    break;
                } else {
                    System.out.println("Input out of range. Please enter a number between " + min + " and " + max + ".");
                }
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return input;
    }

    // Method to prompt user for a yes or no answer
    public static boolean getYNConfirm(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.next().trim().toLowerCase();
            if (input.equals("y")) {
                return true;
            } else if (input.equals("n")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }
    }
}
