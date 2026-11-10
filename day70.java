import java.util.Scanner;
public class day70 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner (System.in);

        System.out.print("Masukkan Nilai untuk Pola Segitiga :");
        int p = masuk.nextInt();

          for(int i = 0; i <= p ;i++){
            for(int j= 0; j <= i ;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        
    }
    
}

