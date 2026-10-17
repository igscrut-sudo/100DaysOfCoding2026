import java.util.Scanner;
public class day46 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        boolean jalan = true;

        while (jalan) {
        
            System.out.println("\n=== Meni Kafe ===");
            System.out.println("1. Kopi Hitam");
            System.out.println("2. Cappuccino");
            System.out.println("3. Teh Manis");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println(">> Anda memesan Kopi Hitam. Harap tunggu sebentar.");
                    break;
                case 2:
                    System.out.println(">> Anda memesan Cappuccino. Harap tunggu sebentar.");
                    break;
                case 3:
                    System.out.println(">> Anda memesan Teh Manis. Harap tunggu sebentar.");
                    break;
                case 4:
                    System.out.println(">> Terima kasih telah berkunjung!");
                    jalan = false;
                    break;
                default:
                    System.out.println(">> Pilihan tidak valid! Silakan masukkan angka 1 hingga 4.");
                    break; 
            }
        }
    }
}
    

