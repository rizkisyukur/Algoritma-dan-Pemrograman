import java.util.Scanner;

public class PositiveNegativeFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Bilangan positif dalam array:");
        for (int num : array) {
            if (num > 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("Bilangan negatif dalam array:");
        for (int num : array) {
            if (num < 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}