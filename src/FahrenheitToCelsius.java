import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        float temperature;

        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        temperature=scanner.nextInt();

        temperature= ((temperature-32)*5)/9;

        System.out.println("Temperature in Celsius: " + temperature);
    }
}
