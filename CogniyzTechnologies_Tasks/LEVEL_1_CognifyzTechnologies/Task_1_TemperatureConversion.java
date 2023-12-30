import java.util.*;
public class Task_1_TemperatureConversion {
    public static void main(String[] ags){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        char unit = scanner.next().charAt(0);
        double convertedTemperature;
        if (unit == 'C' || unit == 'c') {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
        } else if (unit == 'F' || unit == 'f') {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equal to " + convertedTemperature + " Celsius.");
        } else {
            System.out.println("Invalid unit. Please enter 'C' or 'F'.");
        }
        scanner.close();
    }
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
