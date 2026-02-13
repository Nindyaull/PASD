package jobsheet1;

import java.util.Scanner;

public class tugas2 {
    
    //input jadwal
    public static void inputJadwal(String[][] jadwal, int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i+1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam: ");
            jadwal[i][3] = sc.nextLine();

            System.out.println();
        }
    }

    //tampilkan semua jadwal
    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n=== JADWAL KULIAH MAHASISWA ===");
        System.out.println("------------------------------------------------------------------");
        System.out.println("No | Mata Kuliah | Ruang | Hari | Jam");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + " | " + jadwal[i][0] + " | " + jadwal[i][1] + " | " + jadwal[i][2] + " | " + jadwal[i][3]);
        }
    }

    //mencari berdasarkan hari
    public static void cariHari(String[][] jadwal, int n, String hariCari) {
        System.out.println("\nJadwal hari " + hariCari + ":");

        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {
                System.out.println(jadwal[i][0] + " | " + jadwal[i][1] + " | " + jadwal[i][3]);
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak Ada Jadwal Pada Hari Tersebut");
        }
    }

    //Mencari berdasarkan nama mata kuliah
    public static void cariMK(String[][] jadwal, int n, String mkCari) {
        System.out.println("\nJadwal Mata Kuliah " + mkCari + ":");
        
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mkCari)) {
                System.out.println("Hari: " + jadwal[i][2] + 
                                " | Jam: " + jadwal[i][3] + 
                                " | Ruang: " + jadwal[i][1]);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak Ada Jadwal Pada Hari Tersebut");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Jadwal: ");
        int n = Integer.parseInt(sc.nextLine());

        String jadwal[][] = new String[n][4];

        inputJadwal(jadwal, n);
        tampilSemua(jadwal, n);

        System.out.print("\nCari berdasarkan hari: ");
        String hari = sc.nextLine();
        cariHari(jadwal, n, hari);

        System.out.print("\nCari berdasarkan nama mata kuliah: ");
        String mk = sc.nextLine();
        cariMK(jadwal, n, mk);
    }
}
