import java.util.Scanner;
public class day48 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char operasi;
        double angka1, angka2;

        System.out.println("=== Kalkulator Sederhana ===");
        
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();
        
        System.out.print("Pilih operator (+, -, *, /): ");
        operasi = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        switch (operasi) {
            case '+':
                System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + (angka1 - angka2));
                break;
            case '*':
                System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + (angka1 * angka2));
                break;
            case '/':
             
                if (angka2 != 0) {
                    System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + (angka1 / angka2));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                }
                break;
            default:
              
                System.out.println("Error: Operator tidak valid! Harap masukkan +, -, *, atau /.");
                break;
        }

     
    }

    
    
}
