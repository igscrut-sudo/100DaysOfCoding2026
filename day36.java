import java.util.Scanner;
public class day36 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan angka ke-1:");
        int a = masuk.nextInt();

        if(a % 2 == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
        
    }
    
}
