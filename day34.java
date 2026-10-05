import java.util.Scanner;
public class day34 {

    public static void main(String[] args) {


        Scanner masuk = new Scanner (System.in);

        System.out.print("Nilai :");
        int nilai = masuk.nextInt();

    if( nilai >= 100){
        System.out.println("Anda lulus");
    }else if(nilai < 50){
             System.out.println("Tidak memenuhi Syarat kelulusan");
    }
    
}
        
        
    }
    

