import java.util.Scanner;
public class day12 {

    public static void main(String[] args) {

        Scanner jxx = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = jxx.nextLine();
        System.out.print("Nim: ");
        String nim = jxx.nextLine();
        System.out.print("Kelas: ");
        char kelas = jxx.nextLine().charAt(0);
        System.out.print("Prodi: ");
        String prodi = jxx.nextLine();


        System.out.println("===== Output =====");
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(kelas);
        System.out.println(prodi);
        
    }

    
}
