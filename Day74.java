public class ContohString {
    public static void main(String[] args) {
        String teks = "Belajar Java Dasar";

        // 1. Menghitung panjang string
        int panjang = teks.length();
        
        // 2. Mengubah ke huruf kapital
        String hurufbesar = teks.toUpperCase();
        
        // 3. Mengubah ke huruf kecil
        String hurufkecil = teks.toLowerCase();

        System.out.println("Teks asli    : "+ teks);
        System.out.println("Panjang teks : "+ panjang); 
        System.out.println("Upper Case   : "+ hurufBesar);   
        System.out.println("Lower Case   : "+ hurufKecil);   
    }
}
