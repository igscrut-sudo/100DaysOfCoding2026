
import java.util.Scanner;
public class day17 {

    public static void main(String[] args) {

        Scanner uji = new Scanner (System.in);

        int  saldo= 0;

        System.out.print("Setelah Setor tunai: ");
        int a = uji.nextInt();

        System.out.print("Setelah penarik: ");
        int b = uji.nextInt();

        System.out.print("Setelah Bunga tabungan: ");
        int c = uji.nextInt();

        System.out.println("Setelah dibagi 2: ");
        int d = uji.nextInt();

        System.out.println("Sisa setelah modulus 50000: ");
        int e = uji.nextInt();

        saldo += 50000;
        saldo -= 120000;
        saldo *= 1;
        saldo /= 2;
        saldo %= 50000;


        System.out.println("    :"+a);
        System.out.println("    :"+b);
        System.out.println("    :"+c);
        System.out.println("    :"+d);
        System.out.println("    :"+e);

        
    }

}
