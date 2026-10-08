import java.util.Scanner;

public class day37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        
        double bilangan = scanner.nextDouble();

        if (bilangan > 0) {
            System.out.println(bilangan + " bilangan positif.");
        } else if (bilangan < 0) {
            System.out.println(bilangan + " bilangan negatif.");
        } else {
            System.out.println("nol.");
        }

        scanner.close();
    }
}

