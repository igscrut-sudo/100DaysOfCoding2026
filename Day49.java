import java.util.Scanner;
public class day49{
  public static void main(String []args){
    Scanner masuk = new Scanner (System.in);

    System.out.print("masukkan nilai:");
    int nilai = masuk.nextInt();
    
String status = (nilai >= 70) ? "Lulus" : "Tidak Lulus";

System.out.println(status);
  }
}
