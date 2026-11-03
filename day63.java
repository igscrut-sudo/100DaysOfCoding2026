import java.util.Scanner;
public class day63 {

    public static void main(String [] args){

        Scanner masuk = new Scanner (System.in);

        System.out.print("Input nilai M: ");
        int m = masuk.nextInt();

        System.out.print("Pangkat N: ");
        int n = masuk.nextInt();
        

        double hasil = 1;
        for(int i= 1; i <= n; i++){
              hasil *= m;   
        }

        System.out.println(m+"Pangkat"+n+":"+hasil);
    }
    
}
