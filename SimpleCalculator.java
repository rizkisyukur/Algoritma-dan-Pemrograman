import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();

        System.out.println("Hasil Penjumlahan: " + (num1 + num2));
        System.out.println("Hasil Pengurangan: " + (num1 - num2));
        System.out.println("Hasil Perkalian: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Hasil Pembagian: " + (num1 / num2));
        } else {
            System.out.println("Pembagian tidak dapat dilakukan, karena pembagi adalah nol.");
        }
        scanner.close();
    }
}
