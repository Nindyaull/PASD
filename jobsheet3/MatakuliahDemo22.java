package jobsheet3;

import java.util.Scanner;

public class MatakuliahDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam, jmlElemen;
        System.out.print("Masukkan jumlah data yang diinput: ");
        jmlElemen = sc.nextInt();
        sc.nextLine();

        Matakuliah22[] arrayOfMatakuliah = new Matakuliah22[jmlElemen];

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("SKS           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam    : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");
            
            arrayOfMatakuliah[i] = new Matakuliah22();
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }
        
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i].cetakInfo();
            // System.out.println("Kode          : " + arrayOfMatakuliah[i].kode);
            // System.out.println("Nama          : " + arrayOfMatakuliah[i].nama);
            // System.out.println("SKS           : " + arrayOfMatakuliah[i].sks);
            // System.out.println("Jumlah Jam    : " + arrayOfMatakuliah[i].jumlahJam);
            // System.out.println("-----------------------------------");
        }
    }
}
