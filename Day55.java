public class ContohGabungan {

    public static void prosesData(int[] angka) {
        System.out.println("--- Mulai Proses Data ---");

        for (int i = 0; i < angka.length; i++) {
            int nilai = angka[i];

            
          
            if (nilai % 2 == 0) {
                System.out.println("Lewati angka genap: " + nilai);
                continue; // Langsung ke iterasi berikutnya
            }

            // 2. BREAK
            if (nilai == 9) {
                System.out.println("Angka 9 ditemukan! Hentikan loop (break).");
                break; // Keluar dari loop for
            }

            // 3. RETURN: 
            if (nilai < 0) {
                System.out.println("Ada angka negatif (" + nilai + ")! Hentikan seluruh method (return).");
                return; 
            }

            System.out.println("Proses angka ganjil: " + nilai);
        }



        System.out.println("--- Loop Selesai Normal / Ter-break ---");
    }

    public static void main(String[] args) {
        // Menguji continue dan break
        int[] data1 = {2, 3, 4, 5, 9, 7};
        System.out.println("=== UJI COBA 1 ===");
        prosesData(data1);

        System.out.println();

        // Menguji return
        int[] data2 = {1, 3, -5, 7};
        System.out.println("=== UJI COBA 2 ===");
        prosesData(data2);
    }
}
