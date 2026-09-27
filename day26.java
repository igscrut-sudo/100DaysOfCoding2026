import java.util.Scanner;
public class day26 {

    public static void main(String[] args) {

        Scanner masuk = new Scanner (System.in);

        System.out.print("Masukkan Nama    :");
        String nama = masuk.nextLine();

        System.out.print("Masukkan NIM     :");
        String nim = masuk.nextLine();

        System.out.print("Masukkan Kelas   :");
        char kelas = masuk.next().charAt(0);

        System.out.print("Masukkan umur    :");
        int umur = masuk.nextInt();

        masuk.nextLine();

        System.out.print("Masukkan Prodi   :");
        String p = masuk.nextLine();

        System.out.print("Masukkan IPK     :");
        double ipk = masuk.nextDouble();
        
        System.out.print("Status Keaktifan :");
        boolean k = masuk.nextBoolean();

        System.out.println("===== BIODATA MAHASISWA =====" );
        System.out.println("Nama        :"+nama);
        System.out.println("NIM         :"+nim);
        System.out.println("Kelas       :"+kelas);
        System.out.println("Umur        :"+umur+"Tahun");
        System.out.println("Prodi       :"+p);
        System.out.println("IPK         :"+ipk);
        System.out.println("Status Aktif:"+k);
        
    }
    
}
