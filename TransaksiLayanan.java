public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan; 
    int biaya;

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = durasiLayanan * 50000;
    }

    public void print(){
        System.out.println(pasien.nama + " (" + durasiLayanan + " jam): Rp " + biaya);
    }
}
