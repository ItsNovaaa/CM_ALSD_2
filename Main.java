import java.util.Scanner;
public class Main {
    static AntrianPasienLL antrianPasien; 
    static RiwayatTransaksiArrayQueue riwayatTransaksi; 
    static Scanner sc;

    public static void tambahPasien(){
        System.out.print("Nama Pasien: ");
        String nama = sc.nextLine();
        System.out.print("NIK: ");
        String nik = sc.nextLine();
        System.out.print("Keluhan: ");
        String keluhan = sc.nextLine();
        Pasien pasienBaru = new Pasien(nama, nik, keluhan);
        antrianPasien.enqueue(pasienBaru);
        System.out.println(">> Pasien masuk ke dalam antrian.");
    }

    public static void layaniPasien(){
        if (antrianPasien.isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian untuk dilayani.");
            return;
        }
    
        Pasien pasienDilayani = antrianPasien.dequeue(); 
        if (pasienDilayani == null) {
            return;
        }
        System.out.println("Pasien " + pasienDilayani.nama + " dipanggil");
    
        System.out.print("Masukkan ID Dokter: ");
        String idDokter = sc.nextLine();
        System.out.print("Masukkan Nama Dokter: ");
        String namaDokter = sc.nextLine();
        System.out.print("Masukkan Durasi Layanan (jam): ");
        int durasi = -1;
    
        while(durasi < 0) {
                durasi =sc.nextInt();
                sc.nextLine();
                if (durasi <= 0) { 
                    System.out.println("Durasi harus lebih dari 0.");
                    System.out.print("Masukkan lagi:");
                    durasi = -1; 
                }    
        }
    
        Dokter dokter = new Dokter(idDokter, namaDokter);
        TransaksiLayanan transaksi = new TransaksiLayanan(pasienDilayani, dokter, durasi);        
        riwayatTransaksi.enqueue(transaksi); 
        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        antrianPasien = new AntrianPasienLL();
        riwayatTransaksi = new RiwayatTransaksiArrayQueue(50);
        int pilihan;
        
        do {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian"); 
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien"); 
            System.out.println("4. Cek Sisa Antrian Pasien"); 
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahPasien();   
                    break;
                case 2:
                    System.out.println("-- Antrian Pasien --");
                    System.out.println("Antrian Pasien: ");
                    antrianPasien.print();
                break;
                case 3:
                    layaniPasien();
                    break;
                case 4:
                    System.out.println(">> Sisa pasien dalam antrian: " + antrianPasien.getSize());
                    break;
                case 5:
                    System.out.println("-- Riwayat Transaksi --");
                    riwayatTransaksi.print();
                    break;
                default:
                    break;
            }
        } while (pilihan != 0);
    }
}