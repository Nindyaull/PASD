package jobsheet3;

import java.util.Scanner;

public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, jk, dummy;
        boolean jenisKelamin;
        int usia;
        System.out.print("Masukkan jumlah data: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen22[] arrayOfDosen = new Dosen22[jumlah];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Gender (L/P)  : ");
            jk = sc.nextLine();
            jenisKelamin = jk.equalsIgnoreCase("L");
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");
            
            arrayOfDosen[i] = new Dosen22(kode, nama, jenisKelamin, usia);
        }
        
        for (Dosen22 dsn : arrayOfDosen) {
            dsn.cetakInfo();
        }
        
        DataDosen22 data = new DataDosen22();
        
        data.dataSemuaDosen(arrayOfDosen);
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("---------------------------------------");
        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}
