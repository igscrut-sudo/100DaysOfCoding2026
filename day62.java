import java.util.Scanner;
public class day62 {

    public static void main(String [] args){

        Scanner masuk = new Scanner (System.in);

        System.out.print("Input nilai :");
        int n = masuk.nextInt();

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n; j++){
                System.out.println(i*j);
            }

            System.out.println();
        }

    }
    
}
