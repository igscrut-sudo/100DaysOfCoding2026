import java.util.Scanner;
public class day75 {

    public static void main(String[] args) {
        
        Scanner masuk = new Scanner (System.in);

        System.out.print("Isi Teks :");
        String teks  = masuk.nextLine();

        String tek1 = masuk.nextLine();
         
        // mengembalikan nilai benar dari string
        boolean nilaibenar = teks.equals(teks);
        //mengabaikan pertimbangan besar kecil huruf
        boolean kecilbesar = teks.equalsIgnoreCase(tek1);
        // memeriksa apakah sebuah string mengandung rangkaian karakter
         boolean rangkaian = teks.contains(teks);
        // memeriksa apakah sebuah string kosong atau tidak
         boolean kd = teks.isEmpty();

        System.out.println("=============================");
        System.out.println("Teks Asli yang diinput :"+teks);
        System.out.println("Teks Pertimbangab Kecil / Besar:"+tek1);
         System.out.println("=============================");
        System.out.println("Nilai benar String:"+nilaibenar);
         System.out.println("=============================");
        System.out.println("Apakah Sama?: "+kecilbesar);
         System.out.println("=============================");
        System.out.println("Apakah Teks mengandung rangkaian teks: "+rangkaian);
         System.out.println("=============================");
        System.out.println("String kosong / Tidak: "+kd);
        


    }
    
}
