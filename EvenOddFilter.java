import java.util.Scanner;

public class EvenOddFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; ++i) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Bilangan genap dalam array:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        System.out.println("Bilangan ganjil dalam array:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}