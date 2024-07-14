import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tanggal lahir (yyyy-mm-dd): ");
        String birthDateStr = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateStr);

        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);

        System.out.println("Usia Anda: " + age.getYears() + " tahun, " + age.getMonths() + " bulan, dan " + age.getDays() + " hari.");
    }
}