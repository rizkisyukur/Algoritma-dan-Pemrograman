import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Convert Uang dari USD ke IDR");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang dalam USD: ");
        double usdAmount = scanner.nextDouble();
        System.out.print("Masukkan nilai tukar USD ke IDR: ");
        double exchangeRate = scanner.nextDouble();

        double idrAmount = usdAmount * exchangeRate;

        System.out.println("Jumlah uang dalam IDR: " + idrAmount);
    }
}