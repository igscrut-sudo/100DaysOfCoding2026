import java.util.Scanner;


public class day16 {

    public static void main(String[] args) {

        Scanner uji = new Scanner (System.in);

        System.out.print("Siswa: ");
        int siswa = uji.nextInt();
        System.out.print("Kapasitas Bus: ");
        int kbus = uji.nextInt();


        int buspenuh = siswa / kbus;
        System.out.println("BUS yang penuh: "+buspenuh);
        int sisab = siswa%kbus;
        System.out.println("sisa bus: "+sisab);

     

     
     
    }
    
}
