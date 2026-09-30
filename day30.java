import java.util.Scanner;
public class day30 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Angka k-1:");
        int a = masuk.nextInt();

        System.out.print("Masukkan Angka k-2:");
        int b = masuk.nextInt();

        boolean hasil = a <= b != a >= b;

        System.out.println(hasil);

        
    }
    
}
