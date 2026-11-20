import java.util.Scanner;

public class day80 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int[] angka = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Masukkan angka indeks "+ i + " : ");
            angka[i] = masuk.nextInt();
        }

        System.out.println("\n===== Hasil =====");
        System.out.println("Angka indeks 0 : "+ angka[0]);
        System.out.println("Angka indeks 1 : "+ angka[1]);
        System.out.println("Angka indeks 2 : "+ angka[2]);
        System.out.println("Angka indeks 3 : "+ angka[3]);
        System.out.println("Angka indeks 4 : "+ angka[4]);
    }
}
