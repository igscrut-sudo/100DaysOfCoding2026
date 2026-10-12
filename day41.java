public class day41 {

    public static void main(String[] args) {
        
        double gajiPokok = 6000000;
        double tunjanganJabatan = 1200000;
        double tunjanganTransportasi = 800000;
        double potonganKoperasi = 150000;
        

        double totalPendapatan = gajiPokok + tunjanganJabatan + tunjanganTransportasi;
        
    
        double potonganBPJS = gajiPokok * 0.03; 
        double totalPotongan = potonganBPJS + potonganKoperasi;
        
     
        double gajiBersih = totalPendapatan - totalPotongan;
        
      
        System.out.println("=== RINCIAN PENGHASILAN ===");
        System.out.printf("Gaji Pokok            : Rp %,.0f\n", gajiPokok);
        System.out.printf("Tunjangan Jabatan     : Rp %,.0f\n", tunjanganJabatan);
        System.out.printf("Tunjangan Transportasi: Rp %,.0f\n", tunjanganTransportasi);
        System.out.println("-----------------------------------");
        System.out.printf("Total Pendapatan      : Rp %,.0f\n", totalPendapatan);
        
        System.out.println("\n=== RINCIAN POTONGAN ===");
        System.out.printf("Potongan BPJS (3%%)    : Rp %,.0f\n", potonganBPJS);
        System.out.printf("Potongan Koperasi     : Rp %,.0f\n", potonganKoperasi);
        System.out.println("-----------------------------------");
        System.out.printf("Total Potongan        : Rp %,.0f\n", totalPotongan);
        
        System.out.println("\n===================================");
        System.out.printf("GAJI BERSIH           : Rp %,.0f\n", gajiBersih);
        System.out.println("===================================");
    
    }
    
}
