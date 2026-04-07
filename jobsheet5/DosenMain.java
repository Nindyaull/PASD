package jobsheet5;

import java.util.Scanner;

public class DosenMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DataDosen22 data = new DataDosen22();
    int pilih;

    do {
        System.out.println("\n=== MENU DATA DOSEN ===");
        System.out.println("1. Tambah Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Sorting ASC (Bubble Sort - Usia)");
        System.out.println("4. Sorting DSC (Selection Sort - Usia)");
        System.out.println("5. Keluar");
        System.out.print("Pilih Menu: ");
        pilih = sc.nextInt();
        sc.nextLine();

        switch (pilih) {
            case 1:
                System.out.print("Kode: ");
                String kd = sc.nextLine();
                System.out.print("Nama: ");
                String nm = sc.nextLine();
                System.out.print("Jenis Kelamin (L/P): ");
                String gender = sc.nextLine();
                boolean jk = gender.equalsIgnoreCase("L");
                System.out.print("Usia: ");
                int usia = sc.nextInt();

                Dosen22 d = new Dosen22(kd, nm, jk, usia);
                data.tambah(d);
                break;

            case 2:
                System.out.println("\n--- Daftar Seluruh Dosen ---");
                data.tampil();
                break;

            case 3:
                data.SortingASC();
                System.out.println("Data berhasil diurutkan berdasarkan usia (ASC)");
                data.tampil();
                break;

            case 4:
                data.sortingDSC();
                System.out.println("Data berhasil diurutkan berdasarkan usia (DSC)");
                data.tampil();
                break;

            case 5:
                System.out.println("Terimakasih :)");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    } while (pilih != 5);
  }  
}
