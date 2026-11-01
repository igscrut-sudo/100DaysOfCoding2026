import java.util.Scanner;
public class day61 {

    public static void main(String [] args){

        Scanner masuk = new Scanner (System.in);

        System.out.print("Input nilai N:");
        int n = masuk.nextInt();

           int total = n + (n*1)+ 2;

        System.out.println("Jumlah angka dari 1 sampi "+n+" adalah :"+total);

        
    }
    
}
