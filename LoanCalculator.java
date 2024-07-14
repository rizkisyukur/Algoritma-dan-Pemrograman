import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah pinjaman: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Masukkan suku bunga tahunan (%): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Masukkan periode pembayaran (tahun): ");
        int numberOfYears = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = numberOfYears * 12;

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.println("Pembayaran bulanan: " + monthlyPayment);
        System.out.println("Total pembayaran: " + (monthlyPayment * numberOfPayments));
    }
}