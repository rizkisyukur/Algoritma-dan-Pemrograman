import java.util.Scanner;

public class PrimeNumberFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas atas rentang bilangan: ");
        int limit = scanner.nextInt();

        System.out.println("Bilangan prima antara 2 dan " + limit + " adalah:");
        for (int i = 2; i <= limit; ++i) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}