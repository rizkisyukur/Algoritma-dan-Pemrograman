import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String text = scanner.nextLine();
        System.out.print("Masukkan kata yang ingin dicari: ");
        String searchWord = scanner.nextLine();

        String[] words = text.split("\\s+");
        boolean found = false;

        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Kata '" + searchWord + "' ditemukan dalam teks.");
        } else {
            System.out.println("Kata '" + searchWord + "' tidak ditemukan dalam teks.");
        }
    }
}