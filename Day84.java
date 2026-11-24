import java.util.Scanner;

public class day84 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data : ");
        int jumlah = input.nextInt();

        int data[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + " : ");
            data[i] = input.nextInt();
        }

        int maksimal = data[0];

        for (int i = 1; i < jumlah; i++) {
            if (data[i] > maksimal) {
                maksimal = data[i];
            }
        }

        System.out.println("Angka maksimal adalah : " + maksimal);

        input.close();
    }
}
