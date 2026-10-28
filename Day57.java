import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        // Mencetak angka ganjil
        System.out.println("\n--- Angka Ganjil (1 sampai " + n + ") ---");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // Mencetak angka genap
        System.out.println("\n\n--- Angka Genap (1 sampai " + n + ") ---");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


    }
}
