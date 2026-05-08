package TugasJobsheet10;

import java.util.Scanner;

import P2Jobsheet10.Mahasiswa22;

public class MainKRS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianKRS22 antrian = new AntrianKRS22();
        int pilihan;

        do {
            System.out.println("\n=== LAYANAN PERSETUJUAN KRS ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian KRS (2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Belakang");
            System.out.println("6. Cek Info / Statistik KRS");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = sc.nextLine();

                    Mhs22 mhsBaru = new Mhs22(nim, nama, prodi, kelas);
                    antrian.enqueue(mhsBaru);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    antrian.peek2Terdepan();
                    break;
                case 5:
                    antrian.peekBelakang();
                    break;
                case 6:
                    antrian.infoKRS();
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Sistem ditutup. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0); 
        sc.close();
    }
}
