import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    menuTambahPasien(sc);   
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (pilihan != 6);
    }

    public static void menuTambahPasien(Scanner sc) { 
        System.out.print("Nama Pasien: ");
        String nama = sc.nextLine();
        System.out.print("NIK: ");
        String nik = sc.nextLine();
        System.out.print("Keluhan: ");
        String keluhan = sc.nextLine();
    }
}