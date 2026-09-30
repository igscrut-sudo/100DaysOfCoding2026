import java.util.Scanner;
public class day29 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Angka k-1:");
        int a = masuk.nextInt();

        System.out.print("Masukkan angaka k-2:");
        int b = masuk.nextInt();

        boolean e = a < b != a > b;

        System.out.println(e);
        
        
    }
    
}
