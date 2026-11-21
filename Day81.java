import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int[] an = new int[5];

        System.out.println("=== Mengisi Elemen Array ===");
        for (int i = 0; i < an.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            an[i] = m.nextInt();
        }

        System.out.println("\n=== Menampilkan Elemen Array ===");
        for (int i = 0; i < an.length; i++) {
            System.out.println("Elemen indeks ke-" + i + ": " + an[i]);
        }
    }
}
