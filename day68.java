import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = masuk.nextInt();
        System.out.println(); 

       
        System.out.print("Ganjil naik : ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 

        
        System.out.print("Genap naik  : ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 

       
        System.out.print("Ganjil turun: ");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 

    
        System.out.print("Genap turun : ");
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
    }
}
