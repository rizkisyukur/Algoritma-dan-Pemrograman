import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak (dalam kilometer): ");
        double distance = scanner.nextDouble();
        System.out.print("Masukkan waktu tempuh (dalam jam): ");
        double time = scanner.nextDouble();

        double speed = distance / time;

        System.out.println("Kecepatan: " + speed + " km/jam");
    }
}
