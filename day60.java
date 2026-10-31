import java.util.Scanner;
public class day60 {

    public static void main(String [] args){

        Scanner m = new Scanner (System.in);

        System.out.print("Input nilai n:");
        int n = m.nextInt();

        int total = n * (n+1)*2;

        System.out.println("Jumlah angka dari 1 sampi "+n+" adalah :"+total);


    }
    
}
