import java.util.Scanner;
public class day67 {

    public static void main(String [] args){

        Scanner masuk = new Scanner (System.in);

        System.out.print("Input nilai persegi :");
        int p = masuk.nextInt();

        for(int i = 1; i <= p ;i++){
            for(int j= 1; j <= p ;j++){
                System.out.print("0");
            }
            System.out.println("0");

        }


    }
    
}
