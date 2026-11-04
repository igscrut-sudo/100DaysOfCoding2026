import java.util.Scanner;
public class day64 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner (System.in);

        System.out.print("Input nilai Faktorial :");
        int f = masuk.nextInt();

        int hasil = 1;
        for(int i = 1; i <= f; i++){
                  hasil *= i;
        }

        System.out.print(hasil);
        
    }
    
}
