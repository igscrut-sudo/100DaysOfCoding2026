import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner mas = new Scanner(System.in);
        System.out.println("masukkan tinggi");
        int x = mas.nextInt();
        
        for (int i = x; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
