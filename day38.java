import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");

      
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Pilih operasi (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0;
        boolean isValid = true;

      
        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            // Mencegah error pembagian dengan nol
            if (angka2 == 0) {
                System.out.println("\nError: Tidak bisa membagi angka dengan nol!");
                isValid = false;
            } else {
                hasil = angka1 / angka2;
            }
        } else {
            System.out.println("\nError: Operator tidak valid. Harap masukkan +, -, *, atau /.");
            isValid = false;
        }
        if (isValid) {
            System.out.println("\nHasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }

    
    }
                                    }
