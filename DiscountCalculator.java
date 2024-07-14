import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan harga barang: ");
        double price = scanner.nextDouble();
        System.out.print("Masukkan persentase diskon: ");
        double discountPercentage = scanner.nextDouble();

        double discountAmount = price * discountPercentage / 100;
        double discountedPrice = price - discountAmount;

        System.out.println("Harga setelah diskon: " + discountedPrice);
        System.out.println("Jumlah diskon: " + discountAmount);
    }
}