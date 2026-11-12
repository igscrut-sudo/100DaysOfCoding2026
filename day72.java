import java.util.Scanner;
public class day72 {

    public static void main(String[] args) {

           Scanner masuk = new Scanner (System.in);

           int angka;
           int total =0;

           while (true){
            System.out.print("Masukkan Angka: ");
            angka = masuk.nextInt();

            if(angka < 0){
                break;
            }

            total += angka;
           }

           System.out.println("Total pejumlahan: "+total);
        
    }
    
}

