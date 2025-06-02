public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan; 
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = hitungBiaya();
    }

    public int hitungBiaya() {
        return this.durasiLayanan * 50000;
        
    }
}
