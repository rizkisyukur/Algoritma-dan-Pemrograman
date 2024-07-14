import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ScheduleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jam awal (HH:mm): ");
        String startTimeStr = scanner.next();
        System.out.print("Masukkan durasi (dalam menit): ");
        long duration = scanner.nextLong();

        LocalTime startTime = LocalTime.parse(startTimeStr, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime endTime = startTime.plus(duration, ChronoUnit.MINUTES);

        System.out.println("Waktu selesai: " + endTime.format(DateTimeFormatter.ofPattern("HH:mm")));
    }
}