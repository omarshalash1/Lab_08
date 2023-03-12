public class CtoFTableDisplay {
    public static void main(String[] args) {
        // Print table header
        System.out.println("Celsius\tFahrenheit");

        // Loop through Celsius values from -100 to 100 in 1 degree increments
        for (int celsius = -100; celsius <= 100; celsius++) {
            // Convert Celsius to Fahrenheit using CtoF() method
            double fahrenheit = CtoF(celsius);

            // Print Celsius and Fahrenheit values in tabular format
            System.out.printf("%d\t%.1f\n", celsius, fahrenheit);
        }
    }

    // Method to convert Celsius to Fahrenheit
    public static double CtoF(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }
}
