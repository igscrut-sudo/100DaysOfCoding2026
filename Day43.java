public class day43{
    public static void main(String[] args) {
        // Menentukan batas angka yang akan dicek
        int batas = 30; 

        System.out.println("Latihan: Kelipatan 3, 5, serta 3 & 5");
        System.out.println("------------------------------------");

        for (int i = 1; i <= batas; i++) {
            // Cek apakah habis dibagi 3 DAN 5 terlebih dahulu
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " -> Kelipatan 3 dan 5");
            } 
            // Cek apakah habis dibagi 3
            else if (i % 3 == 0) {
                System.out.println(i + " -> Kelipatan 3");
            } 
            // Cek apakah habis dibagi 5
            else if (i % 5 == 0) {
                System.out.println(i + " -> Kelipatan 5");
            } 
            // Jika tidak ketiganya, cukup cetak angkanya saja
            else {
                System.out.println(i);
            }
        }
    }
}
