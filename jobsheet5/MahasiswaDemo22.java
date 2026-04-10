package jobsheet5;

import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        int jmlMhs = 5;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("------------------------------");

            Mahasiswa22 m = new Mahasiswa22(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();
        //melakukan pencarian data sequential
        // System.out.println("----------------------------------------------------");
        // System.out.println("Pencarian Data");
        // System.out.println("----------------------------------------------------");
        // System.out.println("Masukkan IPK Mahasiswa yang Dicari: ");
        // System.out.print("IPK: ");
        // double cari = sc.nextDouble();

        // System.out.println("-------------------------------------");
        // System.out.println("Menggunakan Sequential Searching");
        // System.out.println("-------------------------------------");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);
        
        //melakukan pencarian data Binary
        System.out.println("----------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang Dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        
        System.out.println("-------------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("-------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jmlMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);


        
        // System.out.println("Data mahasiswa sebelum sorting: ");
        // list.tampil();
        
        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionSort();
        // list.tampil();
        // sc.close();
    }
    // Mahasiswa22 m1 = new Mahasiswa22("123", "Zidan", "2A", 3.2);
    // Mahasiswa22 m2 = new Mahasiswa22("124", "Ayu", "2A", 3.5);
    // Mahasiswa22 m3 = new Mahasiswa22("125", "Sofi", "2A", 3.1);
    // Mahasiswa22 m4 = new Mahasiswa22("126", "Sita", "2A", 3.9);
    // Mahasiswa22 m5 = new Mahasiswa22("127", "Miki", "2A", 3.7);

    // list.tambah(m1);
    // list.tambah(m2);
    // list.tambah(m3);
    // list.tambah(m4);
    // list.tambah(m5);
}
