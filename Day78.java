Import java.util.Scanner;

public class day78 {
  public static void main(String[] args) {
    Scanner masuj = new Scanner(System.in);
    System.out.println("buat akun ");
    System.out.print("Buat username : ");
    String buatuser = masuk.nextLine();
    System.out.print("Buat password : ");
    String buatpass = masuk.nextLine();
    System.out.println("akun berhasil dibuat");


     System.out.print("login");
     boolean berhasil = false;

     while (!berhasil) {
         System.out.print("username : ");
         String user = masuk.nextLine();
         System.out.print("password : ");
         String pass = masuk.nextLine();

         if (user.equals(buatuser) && pass.equals(buatpass)) {
            berhasil = true;
            System.out.println("login berhasil, selamat datang : " + user);
         }else {
            System.out.println("username atau password tidak valid");
         }
     }
  }  
}

Ubah code ini dan beri penjelasan
