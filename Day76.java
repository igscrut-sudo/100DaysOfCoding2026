import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan kata pertama : ");
        String teks = sc.nextLine();
        System.out.print("kata yang di ganti    : ");
        String lama = sc.nextLine();
        System.out.print("kata pengganti        : ");
        String baru = sc.nextLine();
        System.out.print("index awal substring   : ");
        int awal = sc.nextInt();
        System.out.print("index akhir substring  : ");
        int akhir = sc.nextInt();

        String bersih = teks.trim();
        System.out.println("teks awal       : [" + teks + "]" );
        System.out.println("setelah trim    : [" + bersih + "]");

        System.out.println("substring       :" + bersih.substring(awal, akhir));
        System.out.println("setelah replace :" + bersih.replace(lama, baru));

    }
}
