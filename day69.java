import java.util.Scanner;
class day70 {
    public static void main(String[] args) {
       Scanner masuk = new Scanner (System.in);

        System.out.print("Pola segitiga siku siku :");
        int p = masuk.nextInt();

        for(int i = 1; i <= p; i++){
          for(int j=1; j <= i; j++){
              System.out.print("*");
          }
            System.out.println();
        }
    }
}
