import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Social Security Number using pattern \d{3}-\d{2}-\d{4}
        String ssn = getRegExString(scanner, "Enter your Social Security Number (###-##-####): ", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your Social Security Number is " + ssn);

        // Prompt user for UC Student M number using pattern (M|m)\d{5}
        String mNumber = getRegExString(scanner, "Enter your UC Student M number (M#####): ", "(M|m)\\d{5}");
        System.out.println("Your UC Student M number is " + mNumber);

        // Prompt user for menu choice using pattern [OoSsVvQq]
        String menuChoice = getRegExString(scanner, "Enter a menu choice (O, S, V, Q): ", "[OoSsVvQq]");
        System.out.println("Your menu choice is " + menuChoice);
    }

    // Method to get a string from the user that matches a given regular expression pattern
    public static String getRegExString(Scanner scanner, String prompt, String regex) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (input.matches(regex)) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a string that matches the pattern: " + regex);
            }
        }
        return input;
    }
}
