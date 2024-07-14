import java.util.Scanner;

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih bangun ruang:");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Silinder");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();

        double volume = 0;

        switch (choice) {
            case 1:
                System.out.print("Masukkan panjang sisi kubus: ");
                double side = scanner.nextDouble();
                volume = Math.pow(side, 3);
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double length = scanner.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double width = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double height = scanner.nextDouble();
                volume = length * width * height;
                break;
            case 3:
                System.out.print("Masukkan jari-jari bola: ");
                double radius = scanner.nextDouble();
                volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                break;
            case 4:
                System.out.print("Masukkan jari-jari silinder: ");
                double cylRadius = scanner.nextDouble();
                System.out.print("Masukkan tinggi silinder: ");
                double cylHeight = scanner.nextDouble();
                volume = Math.PI * Math.pow(cylRadius, 2) * cylHeight;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("Volume bangun ruang: " + volume);
    }
}