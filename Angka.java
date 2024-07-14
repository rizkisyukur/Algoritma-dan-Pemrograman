import java.util.Scanner;


public class Angka {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int answer;
      do {
        System.out.println("");
        System.out.println("Menu: ");
        System.out.println("1. Perkalian");
        System.out.println("2. Pengakaran");
        System.out.println("3. Kuadrat");
        System.out.println("4. keluar");
        System.out.print("enter number: ");
        answer = scanner.nextInt();
      
        switch (answer) {
          case 1:
          System.out.print("input your number: ");
          int limit = scanner.nextInt();
          for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++){
              System.out.print(i * j  + "\t");
            }
            System.out.println("");
          }
          break;
          case 2:
          System.out.print("input your number: ");  
          int limit2 = scanner.nextInt();
          for (double i = 1; i <= limit2; i++) {
              for (double j = 1; j <= limit2; j++){
                double akar = Math.sqrt(i * j);
                System.out.print(akar + "\t");
                }
            System.out.println("");
            }
          break;
          case 3:
          System.out.print("input your number: ");  
          int limit3 = scanner.nextInt();
          for (double i = 1; i <= limit3; i++) {
              for (double j = 1; j <= limit3; j++){
                double kuadrat = (i * j);
                System.out.print((kuadrat * kuadrat) + "\t");
                }
            System.out.println("");
            }
          break;
          case 4:
           System.out.println("Exiting...");
          break;
          default:
          System.out.println("Invalid choice. Please try again.");
            break;
        }
    }while (answer != 4);
}
}
