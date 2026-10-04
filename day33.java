import java.util.Scanner;
public class day33 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner (System.in);

        System.out.println("Nilai :");
        int nilai = masuk.nextInt();

    if( nilai >= 100){
        System.out.println("Anda lulus");
    }else{
             System.out.println("Coba Lagi");
    }
    
}
}
