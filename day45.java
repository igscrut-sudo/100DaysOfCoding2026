import java.util.Scanner;
public class day45 {

    public static void main(String [] args){

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Hari:");
        int hari = masuk.nextInt();

switch (hari) {
    case 1:
        System.out.println("Senin");
        break;
    case 2:
        System.out.println("Selasa");
        break;
    case 3:
        System.out.println("Rabu");
        break;
    default:
        System.out.println("Tidak diketahui");
}
    }
    
}
