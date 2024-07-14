import java.util.Scanner;

public class MaxElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Elemen maksimum dalam array: " + max);
    }
}