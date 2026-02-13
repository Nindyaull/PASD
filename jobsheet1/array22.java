package jobsheet1;
import java.util.Scanner;

public class array22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jmlmatkul = sc.nextInt();
        sc.nextLine();
        
        String mk[] = new String[jmlmatkul];
        int sks[] = new int[jmlmatkul];
        double nilaiAngka[] = new double[jmlmatkul];
        String nilaiHuruf[] = new String[jmlmatkul];
        double bobotNilai[] = new double[jmlmatkul];

        for (int i = 0; i < jmlmatkul; i++) {
            System.out.print("Masukkan MK ke-" + (i+1) + ": ");
            mk[i] = sc.nextLine();
            System.out.print("Masukkan Jumlah SKS: ");
            sks[i] = sc.nextInt();
            sc.nextLine();
        }
        
        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
        }

        for (int i = 0; i < mk.length; i++) {
            if (nilaiAngka[i] > 80 && nilaiAngka[i] < 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");

        System.out.printf("%-40s %-20s %-20s %-20s\n", 
                        "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s %-20s %-20s %-20s\n",
                            mk[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("==========================================================================");

        double totalMutu = 0;
        int totalSKS = 0;
        
        for (int i = 0; i < jmlmatkul; i++) {
            totalMutu += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalMutu / totalSKS;
        System.out.println("IP: " + ip);

        sc.close();
    }
}
