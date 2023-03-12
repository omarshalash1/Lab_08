import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter birth year (1950-2010)
        int birthYear = getRangedInt(scanner, "Enter birth year (1950-2010): ", 1950, 2010);

        // Prompt user to enter birth month (1-12)
        int birthMonth = getRangedInt(scanner, "Enter birth month (1-12): ", 1, 12);

        // Prompt user to enter birth day (1-31, depending on month)
        int birthDay = getBirthDay(scanner, birthYear, birthMonth);

        // Prompt user to enter birth hour (1-24)
        int birthHour = getRangedInt(scanner, "Enter birth hour (1-24): ", 1, 24);

        // Prompt user to enter birth minute (1-59)
        int birthMinute = getRangedInt(scanner, "Enter birth minute (1-59): ", 1, 59);

        // Output user's birth date and time
        System.out.println("Birth date and time: " + birthYear + "-" + birthMonth + "-" + birthDay + " " + birthHour + ":" + birthMinute);
    }

    // Method to get an integer within a given range from the user
    public static int getRangedInt(Scanner scanner, String prompt, int min, int max) {
        int input;
        while (true) {
            System.out.print(prompt);
            try {
                input = scanner.nextInt();
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

    // Method to get the day of birth based on the month and year
    public static int getBirthDay(Scanner scanner, int birthYear, int birthMonth) {
        int birthDay;
        switch (birthMonth) {
            case 2: // February
                if (birthYear % 4 == 0 && (birthYear % 100 != 0 || birthYear % 400 == 0)) {
                    birthDay = getRangedInt(scanner, "Enter birth day (1-29): ", 1, 29);
                } else {
                    birthDay = getRangedInt(scanner, "Enter birth day (1-28): ", 1, 28);
                }
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                birthDay = getRangedInt(scanner, "Enter birth day (1-30): ", 1, 30);
                break;
            default: // January, March, May, July, August, October, December
                birthDay = getRangedInt(scanner, "Enter birth day (1-31): ", 1, 31);
                break;
        }
        return birthDay;
    }
}
