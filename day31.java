import java.util.Scanner;
public class day31 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner (System.in);

        System.out.println("Masukkan Nilai k-1: ");
        boolean a = masuk.nextBoolean();

        System.out.println("Masukkan Nilai k-2: ");
        boolean b = masuk.nextBoolean();

        System.out.println(" a && b :"+(a && b));
        System.out.println(" a || b :"+(a || b));
        System.out.println(" a !a b :"+( !a));
        System.out.println(" a !b b :"+( !b));


    
        

    }
    
}
