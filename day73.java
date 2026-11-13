import java.util.Scanner;

public class MenuBerulang {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int pilihan;

        do {
            // 1. Menampilkan pilihan menu
            System.out.println("\n=== APLIKASI KASIR SEDERHANA ===");
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Pesan Minuman");
            System.out.println("3. Cetak Struk");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda (0-3): ");
            
            pilihan = masuk.nextInt(); 

      
            switch (pilihan) {
                case 1:
                    System.out.println(">> Anda memilih: Pesan Makanan. (Fitur belum tersedia)");
                    break;
                case 2:
                    System.out.println(">> Anda memilih: Pesan Minuman. (Fitur belum tersedia)");
                    break;
                case 3:
                    System.out.println(">> Anda memilih: Cetak Struk. (Struk kosong)");
                    break;
                case 0:
                    System.out.println(">> Keluar dari program. Terima kasih!");
                    break;
                default:
                
                    System.out.println(">> Pilihan tidak valid! Silakan masukkan angka 0 sampai 3.");
            }
            
        } while (pilihan != 0); 

   
    }
}
