import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);

        double reamur = (celsius * 4 / 5);
        System.out.println("Suhu dalam Reamur: " + reamur);

        double kelvin = (celsius + 273);
        System.out.println("Suhu dalam Fahrenheit: " + kelvin);

        double newCelsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Suhu dalam Celsius: " + newCelsius);

        scanner.close();
    }
}