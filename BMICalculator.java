import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan berat badan Anda (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Masukkan tinggi badan Anda (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI Anda adalah: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Berat badan Anda kurang.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Berat badan Anda normal.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Anda mengalami overweight.");
        } else {
            System.out.println("Anda mengalami obesitas.");
        }
    }
}