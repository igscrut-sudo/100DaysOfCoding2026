import java.util.Scanner;

public class SuhuRuangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan suhu ruangan (Celcius): ");
        int suhu = scanner.nextInt();
        
        // Menentukan kondisi ruangan menggunakan if-else
        if (suhu < 20) {
            System.out.println("Kondisi ruangan saat ini: Dingin.");
        } else if (suhu >= 20 && suhu <= 25) {
            System.out.println("Kondisi ruangan saat ini: Normal / Sejuk.");
        } else {
            System.out.println("Kondisi ruangan saat ini: Panas.");
        }
        
        
    }
          }
