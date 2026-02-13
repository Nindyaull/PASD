package jobsheet1;
import java.util.Scanner;

public class pemilihan22 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();
        System.out.println("===============================");
        System.out.println("===============================");
        
        if ((tugas > 100 || tugas < 0) || (kuis > 100 || kuis < 0) || 
            (uts > 100 || uts < 0) || (uas > 100 || uas < 0)) {
                System.out.println("Nilai Tidak Valid");
                System.out.println("===============================");
                System.out.println("===============================");
                return;
            }
            
            nilaiTugas = tugas * 0.2;
            nilaiKuis = kuis * 0.2;
            nilaiUTS = uts * 0.3;
            nilaiUAS = uas * 0.3;
            
            double nilaiAkhir = (nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS);
            String nilaiHuruf;
            
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                System.out.println("Nilai Akhir   : " + nilaiAkhir);
                nilaiHuruf = "A";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                System.out.println("Nilai Akhir   : " + nilaiAkhir);
                nilaiHuruf = "B+";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("Nilai Akhir   : " + nilaiAkhir);
                nilaiHuruf = "B";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("Nilai Akhir   : " + nilaiAkhir);
                nilaiHuruf = "C+";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                System.out.println("Nilai Akhir   : " + nilaiAkhir);
                nilaiHuruf = "C";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("Nilai Akhir   : " + nilaiAkhir);
                nilaiHuruf = "D";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
            } else {
                System.out.println("Nilai Akhir   : " + nilaiAkhir);
                nilaiHuruf = "E";
                System.out.println("Nilai Huruf : " + nilaiHuruf);
            }
            System.out.println("===============================");
            System.out.println("==============================="); 
            
            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS!");
            }
            sc.close();   
    }
}
