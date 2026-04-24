package jobsheet9;

import java.util.Scanner;

public class SuratDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat22 tumpukan = new StackSurat22(10);
        int pilih;

        do {
            System.out.println("\n=== MENU ADMIN PRODI ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();

                    Surat22 srt = new Surat22(id, nama, kelas, jenis, durasi);
                    tumpukan.push(srt);
                    break;

                case 2:
                    Surat22 diproses = tumpukan.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMhs);
                        System.out.println("Surat telah divalidasi.");
                    }
                    break;

                case 3:
                    Surat22 terakhir = tumpukan.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir yang masuk adalah milik: " + terakhir.namaMhs);
                    } else {
                        System.out.println("Belum ada surat yang masuk.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNm = sc.nextLine();
                    tumpukan.cariSurat(cariNm);
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
        
        sc.close();
    }
}
