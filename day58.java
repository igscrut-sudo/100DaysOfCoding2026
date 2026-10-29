import java.util.Scanner;
public class day58 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = masuk.nextInt();

        // Mencetak angka ganjil
        System.out.println("\n--- Angka Ganjil (n sampai " + 1 + ") ---");
        for (int i = n; i >= 1; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // Mencetak angka genap
        System.out.println("\n\n--- Angka Genap (n sampai " + 1 + ") ---");
        for (int i = 1; i >= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();


    }
    
}
