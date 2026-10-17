import java.util.Scanner;
public class day47 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===MENCARI NAMA HARI ===");
        System.out.print("Masukkan angka (1-7): ");
        
        int angkaHari = scanner.nextInt();

        switch (angkaHari) {
            case 1:
                System.out.println("Hari ke-1 adalah Senin.");
                break;
            case 2:
                System.out.println("Hari ke-2 adalah Selasa.");
                break;
            case 3:
                System.out.println("Hari ke-3 adalah Rabu.");
                break;
            case 4:
                System.out.println("Hari ke-4 adalah Kamis.");
                break;
            case 5:
                System.out.println("Hari ke-5 adalah Jumat.");
                break;
            case 6:
                System.out.println("Hari ke-6 adalah Sabtu.");
                break;
            case 7:
                System.out.println("Hari ke-7 adalah Minggu.");
                break;
            default:
                System.out.println("Error: Angka tidak valid! Silakan masukkan angka antara 1 hingga 7.");
                break;

    }
}
    
}
