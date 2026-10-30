import java.util.Scanner;

public class day59 {
public static void main(String[] args) {
Scanner masuk = new Scanner(System.in);

    System.out.print("Masukkan nilai N: ");
    int n = masuk.nextInt();
    System.out.print("Masukkan nilai M: ");
    int m = masuk.nextInt();
    System.out.println("Bilangan kelipatan " + m + " dari 1 sampai " + n + ":");
    for (int i = 1; i <= n; i++) {
        if (i % m == 0) {
            System.out.print(i + " ");
        }
    }
}

}
