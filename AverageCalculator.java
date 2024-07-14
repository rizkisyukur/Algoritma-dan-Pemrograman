import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();
        double[] array = new double[n];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        double average = sum / n;
        System.out.println("Nilai rata-rata: " + average);
    }
}
