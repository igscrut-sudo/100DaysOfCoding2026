import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai angka (0-100): ");
        double nilai = input.nextDouble();
        char predikat;


        if (nilai >= 85 && nilai <= 100) {
            predikat = 'A';
        } else if (nilai >= 70 && nilai < 85) {
            predikat = 'B';
        } else if (nilai >= 55 && nilai < 70) {
            predikat = 'C';
        } else if (nilai >= 40 && nilai < 55) {
            predikat = 'D';
        } else if (nilai >= 0 && nilai < 40) {
            predikat = 'E';
        } else {
            System.out.println("Error: Nilai tidak valid! Harap masukkan angka antara 0 hingga 100.");
          
        }

        System.out.println("Predikat nilai Anda: " + predikat);
        
    }
}
