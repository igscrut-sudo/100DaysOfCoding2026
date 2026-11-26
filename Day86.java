public class Day86 {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
        int cari = 40;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                System.out.println("Angka " + cari + " ditemukan pada indeks " + i);
                break;
            }
        }
    }
}
