
import java.util.Scanner;
public class day23 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner (System.in);

        System.out.print("Masukkan Panjang alas: ");
        double alas = masuk.nextDouble();

        System.out.print("Masukkan Tinggi: ");
        double tinggi = masuk.nextDouble();

        double luas = 0.5 * alas * tinggi;

        System.out.println("Luas Segtiga adalah: "+luas);
        
    }
    
}
